package pl.mm.baeldungCourses.cliWithSpringShell.commands;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultPromptProvider;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimplePromptProvider extends DefaultPromptProvider {

    @Override
    public String getPrompt() {
        return "mariusz-shell>";
    }

    @Override
    public String getProviderName() {
        return "Mariusz Prompt";
    }
}
