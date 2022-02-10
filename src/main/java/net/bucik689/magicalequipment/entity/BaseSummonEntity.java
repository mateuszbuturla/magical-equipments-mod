package net.bucik689.magicalequipment.entity;

import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import java.util.UUID;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.entity.Goals.FollowOwnerGoal;
import net.bucik689.magicalequipment.entity.Goals.TeleportOwnerGoal;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class BaseSummonEntity extends PathfinderMob {

    private final int followOwnerGoalPriority;
    private LivingEntity owner;
    private UUID ownerUUID;
    private boolean summonedByStaff;
    private LivingEntity ownerTarget;

    public BaseSummonEntity(EntityType<? extends PathfinderMob> type, Level worldIn, int followOwnerGoalPriority) {
        super(type, worldIn);
        this.followOwnerGoalPriority = followOwnerGoalPriority;
    }

    @Override
    public void registerGoals() {
    }

    @Override
    public void addAdditionalSaveData(CompoundTag pCompound) {
        if (this.ownerUUID != null) {
            pCompound.putUUID("ownerUUID", this.ownerUUID);
        }

        pCompound.putBoolean("smmonedByStaff", this.summonedByStaff);

        super.addAdditionalSaveData(pCompound);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag pCompound) {

        if (pCompound.contains("ownerUUID")) {
            UUID ownerUUID = pCompound.getUUID("ownerUUID");
            this.ownerUUID = ownerUUID;
        }
        if (pCompound.contains("smmonedByStaff")) {
            boolean findSummonedByStaff = pCompound.getBoolean("smmonedByStaff");
            this.summonedByStaff = findSummonedByStaff;
        }

        super.readAdditionalSaveData(pCompound);
    }

    public void setSummonedByStaff(boolean value) {
        this.summonedByStaff = value;
    }

    public boolean isSummonedByStaff() {
        return this.summonedByStaff;
    }

    public void setOwner(LivingEntity owner) {
        this.ownerUUID = owner.getUUID();
        this.owner = owner;
        this.goalSelector.addGoal(0, new TeleportOwnerGoal(this, owner));
        this.goalSelector.addGoal(this.followOwnerGoalPriority, new FollowOwnerGoal(this, owner, this.getNavigation()));
    }

    public LivingEntity getOwner() {
        return this.owner;
    }

    public UUID getOwnerUUID() {
        return this.ownerUUID;
    }

    public void setOwnerTarget(LivingEntity entity) {
        MagicalEquipment.LOGGER.info("NEW TARGET");
        this.ownerTarget = entity;
    }

    public LivingEntity getOwnerTarget() {
        return this.ownerTarget;
    }

    public void tick() {
        if (this.owner == null && this.ownerUUID != null) {
            Player findOwner = this.level.getPlayerByUUID(this.ownerUUID);
            if (findOwner != null) {
                this.setOwner(findOwner);
            }
        }
        super.tick();
    }
}
