
package net.mcreator.terra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class HEATSHELLItem extends Item {
	public HEATSHELLItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("heatshell");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
