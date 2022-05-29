
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dawnofdungeons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.dawnofdungeons.client.renderer.DwarfRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DawnOfDungeonsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DawnOfDungeonsModEntities.PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DawnOfDungeonsModEntities.DWARF.get(), DwarfRenderer::new);
	}
}
