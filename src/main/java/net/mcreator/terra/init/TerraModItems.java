
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terra.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.terra.item.TrolliumFragmentItem;
import net.mcreator.terra.item.MarusamaItem;
import net.mcreator.terra.item.HarKonnenItem;
import net.mcreator.terra.item.HEATSHELLItem;
import net.mcreator.terra.item.DodododoItem;
import net.mcreator.terra.item.BlueSteelItem;
import net.mcreator.terra.item.BlueIronItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TerraModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TROLLIUM_OXIDE = register(TerraModBlocks.TROLLIUM_OXIDE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TROLLIUM_FRAGMENT = register(new TrolliumFragmentItem());
	public static final Item DREAD_HUSK = register(
			new SpawnEggItem(TerraModEntities.DREAD_HUSK, -16777216, -10092544, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("dread_husk_spawn_egg"));
	public static final Item BLUE_IRON_HELMET = register(new BlueIronItem.Helmet());
	public static final Item BLUE_IRON_CHESTPLATE = register(new BlueIronItem.Chestplate());
	public static final Item BLUE_IRON_LEGGINGS = register(new BlueIronItem.Leggings());
	public static final Item BLUE_IRON_BOOTS = register(new BlueIronItem.Boots());
	public static final Item DODODODO = register(new DodododoItem());
	public static final Item TESTBOSS_1 = register(
			new SpawnEggItem(TerraModEntities.TESTBOSS_1, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("testboss_1_spawn_egg"));
	public static final Item KUBEL_WAGEN = register(
			new SpawnEggItem(TerraModEntities.KUBEL_WAGEN, -16738048, -13408768, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("kubel_wagen_spawn_egg"));
	public static final Item DEAD_WOOD = register(TerraModBlocks.DEAD_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DREAD_LEAF = register(TerraModBlocks.DREAD_LEAF, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DREADROCK = register(TerraModBlocks.DREADROCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SHADE_BORN = register(
			new SpawnEggItem(TerraModEntities.SHADE_BORN, -13421773, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("shade_born_spawn_egg"));
	public static final Item TROLLMITE = register(
			new SpawnEggItem(TerraModEntities.TROLLMITE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("trollmite_spawn_egg"));
	public static final Item BLUE_STEEL = register(new BlueSteelItem());
	public static final Item HEATSHELL = register(new HEATSHELLItem());
	public static final Item HAR_KONNEN = register(new HarKonnenItem());
	public static final Item TOUCHY_FRED = register(
			new SpawnEggItem(TerraModEntities.TOUCHY_FRED, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("touchy_fred_spawn_egg"));
	public static final Item MARUSAMA = register(new MarusamaItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
