package mrthomas20121.create_tools;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CreateTools.MOD_ID)
public class CreateTools {

	public static final String MOD_ID = "create_tools";
	public static final Logger LOGGER = LogManager.getLogger();

	public CreateTools() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		CreateToolsItems.ITEMS.register(bus);
	}
}
