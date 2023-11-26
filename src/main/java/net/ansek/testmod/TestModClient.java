package net.ansek.testmod;

import net.ansek.testmod.screen.HeadComputerScreen;
import net.ansek.testmod.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class TestModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.HEAD_COMPUTER_SCREEN_HANDLER, HeadComputerScreen::new);
    }
}
