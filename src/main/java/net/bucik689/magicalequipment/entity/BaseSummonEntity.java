package net.bucik689.magicalequipment.entity;

import net.minecraft.world.entity.PathfinderMob;

import java.util.UUID;

import net.bucik689.magicalequipment.entity.Goals.FollowOwnerGoal;
import net.bucik689.magicalequipment.entity.Goals.TeleportOwnerGoal;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class BaseSummonEntity extends PathfinderMob {

    private final int followOwnerGoalPriority;
    private LivingEntity owner;
    private UUID ownerUUID;

    public BaseSummonEntity(EntityType<? extends PathfinderMob> type, Level worldIn, int followOwnerGoalPriority) {
        super(type, worldIn);
        this.followOwnerGoalPriority = followOwnerGoalPriority;
    }

    @Override
    public void registerGoals() {
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
}
