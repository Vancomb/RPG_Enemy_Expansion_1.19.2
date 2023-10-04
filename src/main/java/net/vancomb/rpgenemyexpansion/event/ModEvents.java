package net.vancomb.rpgenemyexpansion.event;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.vancomb.rpgenemyexpansion.RpgEnemyExpansion;
import net.vancomb.rpgenemyexpansion.entity.ModEntityTypes;
import net.vancomb.rpgenemyexpansion.entity.client.SwordsmanRenderer;
import net.vancomb.rpgenemyexpansion.entity.custom.SwordsmanEntity;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = RpgEnemyExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {

        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.SWORDSMAN.get(), SwordsmanEntity.setAttributes());

        }

        @SubscribeEvent
        public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(ModEntityTypes.SWORDSMAN.get(), SwordsmanRenderer::new);
        }
    }
}

