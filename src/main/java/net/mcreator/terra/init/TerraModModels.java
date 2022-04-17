
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terra.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.terra.client.model.Modelharkonnenshellfix;
import net.mcreator.terra.client.model.Modelharkonnenshell;
import net.mcreator.terra.client.model.ModelTrollmite;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TerraModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelTrollmite.LAYER_LOCATION, ModelTrollmite::createBodyLayer);
		event.registerLayerDefinition(Modelharkonnenshellfix.LAYER_LOCATION, Modelharkonnenshellfix::createBodyLayer);
		event.registerLayerDefinition(Modelharkonnenshell.LAYER_LOCATION, Modelharkonnenshell::createBodyLayer);
	}
}
