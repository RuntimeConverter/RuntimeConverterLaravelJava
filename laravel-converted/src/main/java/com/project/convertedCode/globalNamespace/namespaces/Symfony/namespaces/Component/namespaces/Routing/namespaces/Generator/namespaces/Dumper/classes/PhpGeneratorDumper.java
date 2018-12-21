package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.namespaces.Dumper.classes.PhpMatcherDumper;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.namespaces.Dumper.classes.GeneratorDumper;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Generator/Dumper/PhpGeneratorDumper.php

*/

public class PhpGeneratorDumper extends GeneratorDumper {

    public PhpGeneratorDumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhpGeneratorDumper.class) {
            this.__construct(env, args);
        }
    }

    public PhpGeneratorDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object dump(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        options.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("class", "ProjectUrlGenerator"),
                                        new ZPair(
                                                "base_class",
                                                "Symfony\\Component\\Routing\\Generator\\UrlGenerator")),
                                options.getObject())
                        .value());
        return ZVal.assign(
                "<?php\n\nuse Symfony\\Component\\Routing\\RequestContext;\nuse Symfony\\Component\\Routing\\Exception\\RouteNotFoundException;\nuse Psr\\Log\\LoggerInterface;\n\n/**\n * This class has been auto-generated\n * by the Symfony Routing Component.\n */\nclass "
                        + toStringR(options.arrayGet(env, "class"), env)
                        + " extends "
                        + toStringR(options.arrayGet(env, "base_class"), env)
                        + "\n{\n    private static $declaredRoutes;\n    private $defaultLocale;\n\n    public function __construct(RequestContext $context, LoggerInterface $logger = null, string $defaultLocale = null)\n    {\n        $this->context = $context;\n        $this->logger = $logger;\n        $this->defaultLocale = $defaultLocale;\n        if (null === self::$declaredRoutes) {\n            self::$declaredRoutes = "
                        + toStringR(this.generateDeclaredRoutes(env), env)
                        + ";\n        }\n    }\n\n"
                        + toStringR(this.generateGenerateMethod(env), env)
                        + "\n}\n");
    }

    @ConvertedMethod
    private Object generateDeclaredRoutes(RuntimeEnv env, Object... args) {
        Object routes = null;
        Object route = null;
        Object name = null;
        Object compiledRoute = null;
        ReferenceContainer properties = new BasicReferenceContainer(null);
        routes = "array(\n";
        for (ZPair zpairResult2010 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(this, "getRoutes", PhpGeneratorDumper.class),
                                "all",
                                PhpGeneratorDumper.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult2010.getKey());
            route = ZVal.assign(zpairResult2010.getValue());
            compiledRoute = env.callMethod(route, "compile", PhpGeneratorDumper.class);
            properties.setObject(ZVal.newArray());
            properties
                    .arrayAppend(env)
                    .set(env.callMethod(compiledRoute, "getVariables", PhpGeneratorDumper.class));
            properties
                    .arrayAppend(env)
                    .set(env.callMethod(route, "getDefaults", PhpGeneratorDumper.class));
            properties
                    .arrayAppend(env)
                    .set(env.callMethod(route, "getRequirements", PhpGeneratorDumper.class));
            properties
                    .arrayAppend(env)
                    .set(env.callMethod(compiledRoute, "getTokens", PhpGeneratorDumper.class));
            properties
                    .arrayAppend(env)
                    .set(env.callMethod(compiledRoute, "getHostTokens", PhpGeneratorDumper.class));
            properties
                    .arrayAppend(env)
                    .set(env.callMethod(route, "getSchemes", PhpGeneratorDumper.class));
            routes =
                    toStringR(routes, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "        '%s' => %s,\n",
                                                    name,
                                                    PhpMatcherDumper.runtimeStaticObject.export(
                                                            env, properties.getObject()))
                                            .value(),
                                    env);
        }

        routes = toStringR(routes, env) + "    )";
        return ZVal.assign(routes);
    }

    @ConvertedMethod
    private Object generateGenerateMethod(RuntimeEnv env, Object... args) {
        return "    public function generate($name, $parameters = array(), $referenceType = self::ABSOLUTE_PATH)\n    {\n        $locale = $parameters['_locale']\n            ?? $this->context->getParameter('_locale')\n            ?: $this->defaultLocale;\n\n        if (null !== $locale && (self::$declaredRoutes[$name.'.'.$locale][1]['_canonical_route'] ?? null) === $name) {\n            unset($parameters['_locale']);\n            $name .= '.'.$locale;\n        } elseif (!isset(self::$declaredRoutes[$name])) {\n            throw new RouteNotFoundException(sprintf('Unable to generate a URL for the named route \"%s\" as such route does not exist.', $name));\n        }\n\n        list($variables, $defaults, $requirements, $tokens, $hostTokens, $requiredSchemes) = self::$declaredRoutes[$name];\n\n        return $this->doGenerate($variables, $defaults, $requirements, $tokens, $parameters, $name, $referenceType, $hostTokens, $requiredSchemes);\n    }";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Generator\\Dumper\\PhpGeneratorDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GeneratorDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Generator\\Dumper\\PhpGeneratorDumper")
                    .setLookup(
                            PhpGeneratorDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("routes")
                    .setFilename("vendor/symfony/routing/Generator/Dumper/PhpGeneratorDumper.php")
                    .addInterface(
                            "Symfony\\Component\\Routing\\Generator\\Dumper\\GeneratorDumperInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\Routing\\Generator\\Dumper\\GeneratorDumper")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
