package net.vancomb.rpgenemyexpansion.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.rpgenemyexpansion.RpgEnemyExpansion;
import net.vancomb.rpgenemyexpansion.entity.custom.SwordsmanEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RpgEnemyExpansion.MOD_ID);

    public static final RegistryObject<EntityType<SwordsmanEntity>> SWORDSMAN =
            ENTITY_TYPES.register("swordsman",
                    () -> EntityType.Builder.of(SwordsmanEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(RpgEnemyExpansion.MOD_ID,"swordsman").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
