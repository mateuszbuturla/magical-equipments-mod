package net.bucik689.magicalequipment.entity.Goals;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.Vec3;

public class TeleportOwnerGoal extends Goal {

    private final Mob entity;
    private final LivingEntity owner;

    public TeleportOwnerGoal(Mob entity, LivingEntity owner) {
        this.entity = entity;
        this.owner = owner;
    }

    public boolean canUse() {

        if (owner == null) {
            return false;
        }

        if (this.distanceToSqr(this.owner) > 300) {
            this.teleportToOwner();
        }

        return false;
    }

    public void teleportToOwner() {
        this.entity.setPosRaw(this.owner.getX(), this.owner.getY(), this.owner.getZ());
        this.entity.setTarget(null);
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
