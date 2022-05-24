package net.ellipog.admintools;

import net.ellipog.admintools.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminTools implements ModInitializer {

	public static final String MOD_ID = "admintools";

	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
