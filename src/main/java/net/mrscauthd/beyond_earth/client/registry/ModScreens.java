package net.mrscauthd.beyond_earth.client.registry;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.mrscauthd.beyond_earth.client.screens.CoalGeneratorScreen;
import net.mrscauthd.beyond_earth.client.screens.SolarPanelScreen;
import net.mrscauthd.beyond_earth.registry.ModScreenHandlers;

public class ModScreens {

    @Environment(EnvType.CLIENT)
    public static void register() {
        HandledScreens.register(ModScreenHandlers.SOLAR_PANEL_SCREEN_HANDLER, SolarPanelScreen::new);
        HandledScreens.register(ModScreenHandlers.COAL_GENERATOR_SCREEN_HANDLER, CoalGeneratorScreen::new);
    }
}
