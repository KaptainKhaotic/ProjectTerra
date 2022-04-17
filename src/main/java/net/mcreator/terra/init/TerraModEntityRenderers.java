
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terra.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.terra.client.renderer.TrollmiteRenderer;
import net.mcreator.terra.client.renderer.TouchyFredRenderer;
import net.mcreator.terra.client.renderer.Testboss1Renderer;
import net.mcreator.terra.client.renderer.ShadeBornRenderer;
import net.mcreator.terra.client.renderer.KubelWagenRenderer;
import net.mcreator.terra.client.renderer.HarKonnenRenderer;
import net.mcreator.terra.client.renderer.DreadHuskRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TerraModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TerraModEntities.DREAD_HUSK, DreadHuskRenderer::new);
		event.registerEntityRenderer(TerraModEntities.TESTBOSS_1, Testboss1Renderer::new);
		event.registerEntityRenderer(TerraModEntities.KUBEL_WAGEN, KubelWagenRenderer::new);
		event.registerEntityRenderer(TerraModEntities.SHADE_BORN, ShadeBornRenderer::new);
		event.registerEntityRenderer(TerraModEntities.TROLLMITE, TrollmiteRenderer::new);
		event.registerEntityRenderer(TerraModEntities.HAR_KONNEN, HarKonnenRenderer::new);
		event.registerEntityRenderer(TerraModEntities.TOUCHY_FRED, TouchyFredRenderer::new);
	}
}
