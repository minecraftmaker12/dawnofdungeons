
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dawnofdungeons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dawnofdungeons.client.model.Modeldwarf;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DawnOfDungeonsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldwarf.LAYER_LOCATION, Modeldwarf::createBodyLayer);
	}
}
