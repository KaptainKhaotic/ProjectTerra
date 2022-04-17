
package net.mcreator.terra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class TrolliumFragmentItem extends Item {
	public TrolliumFragmentItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(63).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("trollium_fragment");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
