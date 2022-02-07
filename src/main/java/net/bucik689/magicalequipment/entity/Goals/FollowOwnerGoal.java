package net.bucik689.magicalequipment.entity.Goals;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.phys.Vec3;

public class FollowOwnerGoal extends Goal {

    private final LivingEntity entity;
    private final LivingEntity owner;
    private final PathNavigation navigation;

    public FollowOwnerGoal(LivingEntity entity, LivingEntity owner, PathNavigation navigation) {
        this.entity = entity;
        this.owner = owner;
        this.navigation = navigation;
    }

    public boolean canUse() {

        if (owner == null) {
            return false;
        }

        MagicalEquipment.LOGGER.info(this.distanceToSqr(this.owner));

        if (this.distanceToSqr(this.owner) < 24) {
            return false;
        }

        return true;
    }

    @Override
    public void tick() {
        super.tick();

        this.navigation.moveTo(this.owner, 1);
    }

    public double distanceToSqr(Entity pEntity) {
        return this.distanceToSqr(pEntity.position());
    }

    public double distanceToSqr(Vec3 pVec) {
        double d0 = this.entity.getX() - pVec.x;
        double d1 = this.entity.getY() - pVec.y;
        double d2 = this.entity.getZ() - pVec.z;
        return d0 * d0 + d1 * d1 + d2 * d2;
    }
}
