package pl.mm.baeldungCourses.cliWithSpringShell.commands;

import org.springframework.shell.core.Completion;
import org.springframework.shell.core.Converter;
import org.springframework.shell.core.MethodTarget;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Component
public class SimpleURLConverter implements Converter<URL> {
    @Override
    public boolean supports(Class<?> requiredType, String optionText) {
        return URL.class.isAssignableFrom(requiredType);
    }

    @Override
    public URL convertFromText(String value, Class<?> requiredType, String optionContext) {
        try {
            return new URL(value);
        } catch (MalformedURLException e) {
            //Ignore
        }
        return null;
    }

    @Override
    public boolean getAllPossibleValues(List<Completion> list, Class<?> aClass, String s, String s1, MethodTarget methodTarget) {
        return false;
    }
}
