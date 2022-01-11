package bucik689.magicalequipments.item.Trinket.Artifacts;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import bucik689.magicalequipments.item.Rarrity;
import bucik689.magicalequipments.item.SlotType;
import bucik689.magicalequipments.item.Trinket.TrinketBase;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class EmblemOfAttack extends TrinketBase {

    private static final UUID ATTACK_SPEED_UUID = UUID.fromString("0ed65227-0e12-4897-afca-a6f491aa8659");

    public EmblemOfAttack(String name, Rarrity rarrity, SlotType slotType) {
        super(name, rarrity, slotType);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = HashMultimap.create();

        modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                new EntityAttributeModifier(ATTACK_SPEED_UUID, "Attack Damage", 2,
                        EntityAttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}