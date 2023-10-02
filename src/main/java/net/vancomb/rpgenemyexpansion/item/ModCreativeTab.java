package net.vancomb.rpgenemyexpansion.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeTab {
    public static final CreativeModeTab RPGENEMYEXPANSION_TAB = new CreativeModeTab("rpgexpansiontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LONGSWORD.get());
        }
    };
}
