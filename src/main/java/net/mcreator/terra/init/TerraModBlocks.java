
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terra.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.terra.block.TrolliumOxideBlock;
import net.mcreator.terra.block.DreadrockBlock;
import net.mcreator.terra.block.DreadLeafBlock;
import net.mcreator.terra.block.DeadWoodBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TerraModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block TROLLIUM_OXIDE = register(new TrolliumOxideBlock());
	public static final Block DEAD_WOOD = register(new DeadWoodBlock());
	public static final Block DREAD_LEAF = register(new DreadLeafBlock());
	public static final Block DREADROCK = register(new DreadrockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			DreadLeafBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			DreadLeafBlock.itemColorLoad(event);
		}
	}
}
