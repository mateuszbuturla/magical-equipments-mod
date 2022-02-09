package net.bucik689.magicalequipment.entity.Goals;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.phys.Vec3;

public class FollowOwnerGoal extends Goal {

    private final Mob entity;
    private final LivingEntity owner;
    private final PathNavigation navigation;

    public FollowOwnerGoal(Mob entity, LivingEntity owner, PathNavigation navigation) {
        this.entity = entity;
        this.owner = owner;
        this.navigation = navigation;
    }

    public boolean canUse() {

        if (this.owner == null || this.entity.getTarget() != null) {
            return false;
        }

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