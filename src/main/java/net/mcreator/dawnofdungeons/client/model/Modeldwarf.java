package net.mcreator.dawnofdungeons.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldwarf<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dawn_of_dungeons", "modeldwarf"), "main");
	public final ModelPart bone3;
	public final ModelPart bone2;
	public final ModelPart bone4;
	public final ModelPart bb_main;

	public Modeldwarf(ModelPart root) {
		this.bone3 = root.getChild("bone3");
		this.bone2 = root.getChild("bone2");
		this.bone4 = root.getChild("bone4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.0F, 24.0F, 9.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r1 = bone3.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(20, 0).addBox(-4.0F, -1.0F, 3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -7.0F, 11.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 0.0F, 6.0F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -7.0F, 13.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -17.0F, 4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 20)
						.addBox(0.0F, -16.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(-3.0F, -12.0F, 4.0F, 5.0F,
								2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 23.0F, -3.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(23, 20).addBox(-17.0F, -1.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -17.0F, 4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 20)
						.addBox(0.0F, -16.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(-3.0F, -12.0F, 4.0F, 5.0F,
								2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 23.0F, -3.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(23, 20).addBox(-17.0F, -1.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, 0.0F, 14.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 23)
						.addBox(-5.0F, 4.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 23).addBox(-5.0F, 4.0F, 7.0F, 2.0F, 3.0F,
								2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -7.0F, 4.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 6)
						.addBox(-3.0F, -4.0F, -4.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(20, 5).addBox(-2.0F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
