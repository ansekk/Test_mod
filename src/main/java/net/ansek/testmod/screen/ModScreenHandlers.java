package net.ansek.testmod.screen;

import net.ansek.testmod.TestMod;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<HeadComputerScreenHandler> HEAD_COMPUTER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(TestMod.MOD_ID, "cell_controller"),
                    new ExtendedScreenHandlerType<>(HeadComputerScreenHandler::new));

    public static void registerScreenHandlers() {
        TestMod.LOGGER.info("Registering screen handlers for " + TestMod.MOD_ID);
    }
}
