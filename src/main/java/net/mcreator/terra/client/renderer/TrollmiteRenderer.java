package net.mcreator.terra.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.terra.entity.TrollmiteEntity;
import net.mcreator.terra.client.model.ModelTrollmite;

public class TrollmiteRenderer extends MobRenderer<TrollmiteEntity, ModelTrollmite<TrollmiteEntity>> {
	public TrollmiteRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTrollmite(context.bakeLayer(ModelTrollmite.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TrollmiteEntity entity) {
		return new ResourceLocation("terra:textures/trollmitetexture.png");
	}
}
