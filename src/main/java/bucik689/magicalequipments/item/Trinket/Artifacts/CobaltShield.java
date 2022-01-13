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

public class CobaltShield extends TrinketBase {

    private static final UUID KNOCKBACK_RESISTANCE_UUID = UUID.fromString("c1d4614a-dc4b-445d-837c-9d58558db93f");

    public CobaltShield(String name, Rarrity rarrity, SlotType slotType) {
        super(name, rarrity, slotType);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = HashMultimap.create();

        modifiers.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                new EntityAttributeModifier(KNOCKBACK_RESISTANCE_UUID, "Knockback Resistance", 1.0D,
                        EntityAttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}