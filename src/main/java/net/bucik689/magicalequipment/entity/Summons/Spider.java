package net.bucik689.magicalequipment.entity.Summons;

import net.bucik689.magicalequipment.entity.BaseSummonEntity;
import net.bucik689.magicalequipment.entity.Goals.TeleportOwnerGoal;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.MoveTowardsTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimationTickable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class Spider extends BaseSummonEntity implements IAnimatable, IAnimationTickable {
    private AnimationFactory factory = new AnimationFactory(this);

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController()
                .setAnimation(new AnimationBuilder().addAnimation("animation.spider.idle",
                        true));
        // if (event.isMoving()) {
        // event.getController()
        // .setAnimation(new AnimationBuilder().addAnimation("animation.spider.walk",
        // true));
        // } else {
        // event.getController()
        // .setAnimation(new AnimationBuilder().addAnimation("animation.spider.idle",
        // true));
        // }

        return PlayState.CONTINUE;
    }

    public Spider(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn, 5);
    }

    @Override
    public void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, true));
        this.targetSelector.addGoal(2,
                new NearestAttackableTargetGoal<>(this, Mob.class, 0, true, false, (target) -> {
                    return target instanceof Enemy;
                }));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 6.0F));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return LivingEntity.createLivingAttributes().add(Attributes.ATTACK_DAMAGE, 2).add(Attributes.MAX_HEALTH, 35)
                .add(Attributes.FOLLOW_RANGE, 40).add(Attributes.MOVEMENT_SPEED, 0.4f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f);
    }

    @Override
    public void registerControllers(AnimationData data) {
        AnimationController<Spider> controller = new AnimationController<>(this, "controller", 0,
                this::predicate);
        data.addAnimationController(controller);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public int tickTimer() {
        return tickCount;
    }
}
