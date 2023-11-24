package net.ansek.testmod.item;

import net.ansek.testmod.TestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TEST_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "test_mod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.test_mod"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_BAR);
                    }).build());

    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registering item groups for " + TestMod.MOD_ID);
    }
}
