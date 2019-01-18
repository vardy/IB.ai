/**
 * Copyright 2018 Arraying
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

/**
 * @author Arraying
 * @since 2018.09.17
 */

package com.ibdiscord.command;

import com.ibdiscord.command.commands.*;
import com.ibdiscord.command.commands.tag.TagCommand;
import lombok.Getter;

public enum CommandCollection {

    // Commands listed as enumerations.
    // COMMAND_NAME(new NameCommand());
    // Have the decency to put them in alphabetical order you imbeciles.
    ECHO(new EchoCommand()),
    EVAL(new EvalCommand()),
    HELP(new HelpCommand()),
    KICK(new KickCommand()),
    MOD_LOG(new ModLogCommand()),
    PING(new PingCommand()),
    SERVER_INFO(new ServerInfoCommand()),
    SET_PREFIX(new SetPrefixCommand()),
    TAG(new TagCommand()),
    TEST_OPTIONS(new TestOptionsCommand()),
    USER_INFO(new UserInfoCommand()),
    USER_ROLES(new UserRolesCommand());

    @Getter private final Command command;

    CommandCollection(Command command) {
        this.command = command;
    }
}
