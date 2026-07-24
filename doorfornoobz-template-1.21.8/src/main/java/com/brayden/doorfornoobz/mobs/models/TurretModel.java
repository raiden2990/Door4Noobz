package com.brayden.doorfornoobz.mobs.models;// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.brayden.doorfornoobz.mobs.render.TurretRenderState;
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

public class TurretModel extends EntityModel<TurretRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("modid", "turretmodel"), "main");
	private final ModelPart everything;
	private final ModelPart thing2;
	private final ModelPart thing1;
	private final ModelPart cube3;
	private final ModelPart cube4;
	private final ModelPart cube5;
	private final ModelPart cube6;
	private final ModelPart cube7;
	private final ModelPart cube8;
	private final ModelPart cube;


	public TurretModel (ModelPart root) {
		super(root);
		this.everything = root.getChild("everything");
		this.thing2 = this.everything.getChild("thing2");
		this.thing1 = this.thing2.getChild("thing 1");
		this.cube3 = this.thing1.getChild("cube3");
		this.cube4 = this.thing1.getChild("cube4");
		this.cube5 = this.thing1.getChild("cube5");
		this.cube6 = this.thing1.getChild("cube6");
		this.cube7 = this.thing1.getChild("cube7");
		this.cube8 = this.thing2.getChild("cube8");
		this.cube = this.thing2.getChild("cube");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition thing2 = everything.addOrReplaceChild("thing2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition thing1 = thing2.addOrReplaceChild("thing 1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube3 = thing1.addOrReplaceChild("cube3", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, 4.0F, -20.0F, 3.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -25.0F, 19.0F));

		PartDefinition cube4 = thing1.addOrReplaceChild("cube4", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -5.0F, -25.0F, 10.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -25.0F, 19.0F));

		PartDefinition cube5 = thing1.addOrReplaceChild("cube5", CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, -4.0F, -11.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -25.0F, 19.0F));

		PartDefinition cube6 = thing1.addOrReplaceChild("cube6", CubeListBuilder.create().texOffs(44, 37).addBox(-2.0F, -3.0F, -10.0F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -25.0F, 19.0F));

		PartDefinition cube7 = thing1.addOrReplaceChild("cube7", CubeListBuilder.create().texOffs(48, 8).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -25.0F, 19.0F));

		PartDefinition cube8 = thing2.addOrReplaceChild("cube8", CubeListBuilder.create().texOffs(0, 23).addBox(-7.0F, 26.0F, -25.0F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -25.0F, 19.0F));

		PartDefinition cube = thing2.addOrReplaceChild("cube", CubeListBuilder.create().texOffs(0, 37).addBox(-6.0F, 24.0F, -24.0F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -25.0F, 19.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}


}