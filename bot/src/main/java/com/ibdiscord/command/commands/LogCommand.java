package com.ibdiscord.command.commands;

import com.ibdiscord.command.commands.abstracted.LoggingCommand;
import com.ibdiscord.command.permissions.CommandPermission;
import com.ibdiscord.data.db.entries.GuildData;
import net.dv8tion.jda.core.Permission;

import java.util.HashSet;
import java.util.Set;

/**
 * Copyright 2019 Arraying
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public final class LogCommand extends LoggingCommand {

    /**
     * Creates the command.
     */
    public LogCommand() {
        super("log",
                Set.of("setlog"),
                CommandPermission.discord(Permission.MANAGE_SERVER),
                new HashSet<>(),
                GuildData.LOGS
        );
        this.correctUsage = "log [new channel]";
    }

}