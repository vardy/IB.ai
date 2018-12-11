package com.ibdiscord.command.commands;

import com.ibdiscord.command.Command;
import com.ibdiscord.command.CommandContext;
import com.ibdiscord.command.permissions.CommandPermission;
import com.ibdiscord.data.db.ModLogData;
import com.ibdiscord.main.IBai;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.Permission;

import java.awt.*;
import java.util.HashSet;

public class ModLogCommand extends Command {

    public ModLogCommand() {
        super("setmodlog",
                new HashSet<>(),
                CommandPermission.discord(Permission.MANAGE_SERVER),
                new HashSet<>());
    }
    @Override
    protected void execute(CommandContext context) {
        String botPrefix = IBai.getConfig().getStaticPrefix();
        if (context.getArguments().length != 1) {
            context.reply("Correct usage: `" + botPrefix + "SetModLog [ModLog Channel ID]`");
            return;
        }

        String channelID = context.getArguments()[0];

        if(context.getGuild().getTextChannelById(channelID) == null) {
            context.reply("Invalid Channel ID ( " +  channelID + ")." );
            return;
        }

        try {
            ModLogData modLogID = new ModLogData(context.getGuild().getId());
            modLogID.set(channelID);
            IBai.getDatabase().getGravity().save(modLogID);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}