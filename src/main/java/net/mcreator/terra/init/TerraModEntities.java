
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terra.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.terra.entity.TrollmiteEntity;
import net.mcreator.terra.entity.TouchyFredEntity;
import net.mcreator.terra.entity.Testboss1Entity;
import net.mcreator.terra.entity.ShadeBornEntity;
import net.mcreator.terra.entity.KubelWagenEntity;
import net.mcreator.terra.entity.HarKonnenEntity;
import net.mcreator.terra.entity.DreadHuskEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TerraModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<DreadHuskEntity> DREAD_HUSK = register("dread_husk",
			EntityType.Builder.<DreadHuskEntity>of(DreadHuskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DreadHuskEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<Testboss1Entity> TESTBOSS_1 = register("testboss_1",
			EntityType.Builder.<Testboss1Entity>of(Testboss1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(Testboss1Entity::new).sized(0.6f, 1.8f));
	public static final EntityType<KubelWagenEntity> KUBEL_WAGEN = register("kubel_wagen",
			EntityType.Builder.<KubelWagenEntity>of(KubelWagenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KubelWagenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<ShadeBornEntity> SHADE_BORN = register("shade_born",
			EntityType.Builder.<ShadeBornEntity>of(ShadeBornEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadeBornEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<TrollmiteEntity> TROLLMITE = register("trollmite",
			EntityType.Builder.<TrollmiteEntity>of(TrollmiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrollmiteEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<HarKonnenEntity> HAR_KONNEN = register("entitybullethar_konnen",
			EntityType.Builder.<HarKonnenEntity>of(HarKonnenEntity::new, MobCategory.MISC).setCustomClientFactory(HarKonnenEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TouchyFredEntity> TOUCHY_FRED = register("touchy_fred",
			EntityType.Builder.<TouchyFredEntity>of(TouchyFredEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TouchyFredEntity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DreadHuskEntity.init();
			Testboss1Entity.init();
			KubelWagenEntity.init();
			ShadeBornEntity.init();
			TrollmiteEntity.init();
			TouchyFredEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DREAD_HUSK, DreadHuskEntity.createAttributes().build());
		event.put(TESTBOSS_1, Testboss1Entity.createAttributes().build());
		event.put(KUBEL_WAGEN, KubelWagenEntity.createAttributes().build());
		event.put(SHADE_BORN, ShadeBornEntity.createAttributes().build());
		event.put(TROLLMITE, TrollmiteEntity.createAttributes().build());
		event.put(TOUCHY_FRED, TouchyFredEntity.createAttributes().build());
	}
}
