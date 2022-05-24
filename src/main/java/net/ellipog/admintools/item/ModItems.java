package net.ellipog.admintools.item;

import net.ellipog.admintools.AdminTools;
import net.ellipog.admintools.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CHORUS_STICK = registerItem("chorus_stick",
            new ChorusStickItem(new FabricItemSettings().group(ModItemsGroup.ADMINTOOLS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AdminTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdminTools.LOGGER.info("Registering Mod Items for " + AdminTools.MOD_ID);
    }

}
