package net.bucik689.magicalequipment.entity.Goals;

import net.bucik689.magicalequipment.entity.BaseSummonEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;

public class AssistOwner extends Goal {

    private BaseSummonEntity entity;

    public AssistOwner(BaseSummonEntity entity) {
        this.entity = entity;
    }

    public boolean canUse() {

        LivingEntity ownerTarget = this.entity.getOwnerTarget();

        if (ownerTarget == null || !ownerTarget.isAlive()) {
            return false;
        }

        return true;
    }

    @Override
    public void tick() {
        super.tick();
        this.entity.setTarget(this.entity.getOwnerTarget());
    }
}
