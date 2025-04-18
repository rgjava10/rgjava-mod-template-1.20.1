package net.rgjava.rgjavamod.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rgjava.rgjavamod.Rgjavamod;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Rgjavamod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(Moditems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(Moditems.RUBY);
                        entries.add(Moditems.RAW_RUBY);


                    }).build());

    public static void registerItemGroups() {

        Rgjavamod.LOGGER.info("Registering Item Groups for " + Rgjavamod.MOD_ID);
    }
}
