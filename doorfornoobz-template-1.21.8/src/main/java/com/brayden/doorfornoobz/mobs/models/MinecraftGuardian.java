package com.brayden.doorfornoobz.mobs.models;// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.brayden.doorfornoobz.doorfornoobz;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class MinecraftGuardian<T extends EntityRenderState> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(doorfornoobz.MODID, "minecraftguardian"), "main");
	private final ModelPart bb_main;

	public MinecraftGuardian(ModelPart root) {
        super(root);
        this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -16.0F, -6.0F, 6.0F, 16.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -16.0F, 3.0F, 6.0F, 16.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-1.0F, -29.0F, -6.0F, 6.0F, 13.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(2, 49).addBox(-1.0F, -36.0F, -3.0F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(1, 35).addBox(-1.0F, -38.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 30).addBox(-1.0F, -40.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 42).addBox(-1.0F, -31.0F, -5.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 42).addBox(-1.0F, -31.0F, 4.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 31).addBox(-1.0F, -37.0F, 1.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(41, 32).addBox(-1.0F, -37.0F, -3.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 48).addBox(-1.0F, -36.0F, 3.0F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 27).addBox(-1.0F, -37.0F, -3.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(32, 48).addBox(-1.0F, -36.0F, -4.0F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(45, 82).addBox(-1.0F, -28.0F, 7.0F, 6.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(45, 82).addBox(-1.0F, -28.0F, -9.0F, 6.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(82, 1).addBox(-4.0F, -17.0F, 8.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(79, 28).addBox(-6.0F, -17.0F, 6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(80, 29).addBox(-8.0F, -17.0F, 10.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(80, 29).addBox(-8.0F, -17.0F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(79, 72).addBox(-8.0F, -17.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(68, 49).addBox(-26.0F, -17.0F, 7.0F, 18.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(65, 3).addBox(-30.0F, -17.0F, 8.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(63, 90).addBox(-24.0F, -17.0F, 6.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 90).addBox(-23.0F, -17.0F, 10.0F, 15.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 59).addBox(-1.0F, -2.0F, -1.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -37.0F, 1.0F, 0.0F, 0.0F, 1.0472F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}
}