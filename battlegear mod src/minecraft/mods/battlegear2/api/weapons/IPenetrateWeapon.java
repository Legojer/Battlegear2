package mods.battlegear2.api.weapons;

import net.minecraft.item.ItemStack;

/**
 * {@see Attributes#armourPenetrate}
 */
@Deprecated
public interface IPenetrateWeapon {
	/**
	 * The amount of damage bypassing armor
	 * @param stack The {@link ItemStack} representative of the item dealing the hit.
	 * @return the amount of damage that bypasses armour
	 */
	int getPenetratingPower(ItemStack stack);
}
