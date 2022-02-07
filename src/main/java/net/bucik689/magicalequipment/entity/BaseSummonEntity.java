package net.bucik689.magicalequipment.entity;

import net.minecraft.world.entity.PathfinderMob;
import net.bucik689.magicalequipment.entity.Goals.FollowOwnerGoal;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class BaseSummonEntity extends PathfinderMob {

    private final int followOwnerGoalPriority;
    private LivingEntity owner;

    public BaseSummonEntity(EntityType<? extends PathfinderMob> type, Level worldIn, int followOwnerGoalPriority) {
        super(type, worldIn);
        this.followOwnerGoalPriority = followOwnerGoalPriority;
    }

    @Override
    public void registerGoals() {
    }

    public void setOwner(LivingEntity owner) {
        this.owner = owner;
        this.goalSelector.addGoal(this.followOwnerGoalPriority, new FollowOwnerGoal(this, owner, this.getNavigation()));
    }

    public LivingEntity getOwner() {
        return this.owner;
    }
}
