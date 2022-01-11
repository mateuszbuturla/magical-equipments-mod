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

public class EmblemOfFierce extends TrinketBase {

    private static final UUID ATTACK_SPEED_UUID = UUID.fromString("5de6daef-2e75-4eb3-b825-480ed6952891");

    public EmblemOfFierce(String name, Rarrity rarrity, SlotType slotType) {
        super(name, rarrity, slotType);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = HashMultimap.create();

        modifiers.put(EntityAttributes.GENERIC_ATTACK_SPEED,
                new EntityAttributeModifier(ATTACK_SPEED_UUID, "Attack Speed", 1,
                        EntityAttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}