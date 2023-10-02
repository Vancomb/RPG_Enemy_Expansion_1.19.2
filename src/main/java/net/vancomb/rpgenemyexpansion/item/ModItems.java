package net.vancomb.rpgenemyexpansion.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.rpgenemyexpansion.RpgEnemyExpansion;
import net.vancomb.rpgenemyexpansion.entity.ModEntityTypes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RpgEnemyExpansion.MOD_ID);

    public static final RegistryObject<Item> LONGSWORD = ITEMS.register("longsword",
    () -> new Item(new Item.Properties().tab(ModCreativeTab.RPGENEMYEXPANSION_TAB)));

    public static final RegistryObject<Item> SWORSDMAN_SPAWN_EGG = ITEMS.register("swordsman_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SWORDSMAN, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeTab.RPGENEMYEXPANSION_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
