package net.rgjava.rgjavamod;

import net.fabricmc.api.ModInitializer;

import net.rgjava.rgjavamod.item.ModItemGroups;
import net.rgjava.rgjavamod.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rgjavamod implements ModInitializer {
	public static final String MOD_ID = "rgjavamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		Moditems.registerModItems();


	}
}