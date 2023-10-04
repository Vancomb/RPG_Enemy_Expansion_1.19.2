package net.vancomb.rpgenemyexpansion.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.vancomb.rpgenemyexpansion.RpgEnemyExpansion;
import net.vancomb.rpgenemyexpansion.entity.client.models.SwordsmanEntityModel;
import net.vancomb.rpgenemyexpansion.entity.custom.SwordsmanEntity;

public class SwordsmanRenderer extends HumanoidMobRenderer<SwordsmanEntity, SwordsmanEntityModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(RpgEnemyExpansion.MOD_ID, "textures/entities/swordsman.png");

    public SwordsmanRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new SwordsmanEntityModel(), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SwordsmanEntity entity) {
        return TEXTURE;
    }
}
