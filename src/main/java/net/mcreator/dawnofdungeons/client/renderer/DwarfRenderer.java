
package net.mcreator.dawnofdungeons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.dawnofdungeons.entity.DwarfEntity;
import net.mcreator.dawnofdungeons.client.model.Modeldwarf;

public class DwarfRenderer extends MobRenderer<DwarfEntity, Modeldwarf<DwarfEntity>> {
	public DwarfRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldwarf(context.bakeLayer(Modeldwarf.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<DwarfEntity, Modeldwarf<DwarfEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dawn_of_dungeons:textures/glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DwarfEntity entity) {
		return new ResourceLocation("dawn_of_dungeons:textures/dwarf.png");
	}
}
