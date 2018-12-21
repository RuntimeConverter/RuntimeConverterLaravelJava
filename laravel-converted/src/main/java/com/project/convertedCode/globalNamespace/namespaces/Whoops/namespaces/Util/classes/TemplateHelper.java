package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes.HtmlDumperOutput;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.VarCloner;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.HtmlDumper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_arg;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.array.function_extract;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Util/TemplateHelper.php

*/

public class TemplateHelper extends RuntimeClassBase {

    public Object variables = ZVal.newArray();

    public Object htmlDumper = null;

    public Object htmlDumperOutput = null;

    public Object cloner = null;

    public Object applicationRootPath = null;

    public TemplateHelper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TemplateHelper.class) {
            this.__construct(env, args);
        }
    }

    public TemplateHelper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.applicationRootPath =
                function_dirname
                        .f
                        .env(env)
                        .call(
                                function_dirname
                                        .f
                                        .env(env)
                                        .call(
                                                function_dirname
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                function_dirname
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                function_dirname
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                function_dirname
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                env
                                                                                                                        .addRootFilesystemPrefix(
                                                                                                                                "/vendor/filp/whoops/src/Whoops/Util"))
                                                                                                        .value())
                                                                                        .value())
                                                                        .value())
                                                        .value())
                                        .value())
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "raw")
    public Object escape(RuntimeEnv env, Object... args) {
        Object raw = assignParameter(args, 0, false);
        Object flags = null;
        flags = 3;
        if (ZVal.toBool(function_defined.f.env(env).call("ENT_SUBSTITUTE").value())
                && ZVal.toBool(!function_defined.f.env(env).call("HHVM_VERSION").getBool())) {
            flags = ZAssignment.or("|=", flags, 8);

        } else {
            flags = ZAssignment.or("|=", flags, 4);
        }

        raw =
                function_str_replace
                        .f
                        .env(env)
                        .call(NamespaceGlobal.chr.env(env).call(9).value(), "    ", raw)
                        .value();
        return ZVal.assign(
                NamespaceGlobal.htmlspecialchars.env(env).call(raw, flags, "UTF-8").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "raw")
    public Object escapeButPreserveUris(RuntimeEnv env, Object... args) {
        Object raw = assignParameter(args, 0, false);
        Object escaped = null;
        escaped = this.escape(env, raw);
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "@([A-z]+?://([-\\w\\.]+[-\\w])+(:\\d+)?(/([\\w/_\\.#-]*(\\?\\S+)?[^\\.\\s])?)?)@",
                                "<a href=\"$1\" target=\"_blank\" rel=\"noreferrer noopener\">$1</a>",
                                escaped)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delimiter")
    @ConvertedParameter(index = 1, name = "s")
    public Object breakOnDelimiter(RuntimeEnv env, Object... args) {
        Object delimiter = assignParameter(args, 0, false);
        Object s = assignParameter(args, 1, false);
        ReferenceContainer part = new BasicReferenceContainer(null);
        Object parts = null;
        parts = function_explode.f.env(env).call(delimiter, s).value();
        for (ZPair zpairResult62 : ZVal.getIterable(parts, env, true)) {
            part = zpairResult62;
            part.setObject(
                    "<div class=\"delimiter\">" + toStringR(part.getObject(), env) + "</div>");
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(delimiter, parts).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object shorten(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (ZVal.notEqualityCheck(this.applicationRootPath, "/")) {
            path =
                    function_str_replace
                            .f
                            .env(env)
                            .call(this.applicationRootPath, "&hellip;", path)
                            .value();
        }

        return ZVal.assign(path);
    }

    @ConvertedMethod
    private Object getDumper(RuntimeEnv env, Object... args) {
        Object styles = null;
        if (ZVal.toBool(!ZVal.isTrue(this.htmlDumper))
                && ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call("Symfony\\Component\\VarDumper\\Cloner\\VarCloner")
                                .value())) {
            this.htmlDumperOutput = new HtmlDumperOutput(env);
            this.htmlDumper = new HtmlDumper(env, this.htmlDumperOutput);
            styles =
                    ZVal.newArray(
                            new ZPair(
                                    "default",
                                    "color:#FFFFFF; line-height:normal; font:12px \"Inconsolata\", \"Fira Mono\", \"Source Code Pro\", Monaco, Consolas, \"Lucida Console\", monospace !important; word-wrap: break-word; white-space: pre-wrap; position:relative; z-index:99999; word-break: normal"),
                            new ZPair("num", "color:#BCD42A"),
                            new ZPair("const", "color: #4bb1b1;"),
                            new ZPair("str", "color:#BCD42A"),
                            new ZPair("note", "color:#ef7c61"),
                            new ZPair("ref", "color:#A0A0A0"),
                            new ZPair("public", "color:#FFFFFF"),
                            new ZPair("protected", "color:#FFFFFF"),
                            new ZPair("private", "color:#FFFFFF"),
                            new ZPair("meta", "color:#FFFFFF"),
                            new ZPair("key", "color:#BCD42A"),
                            new ZPair("index", "color:#ef7c61"));
            env.callMethod(this.htmlDumper, "setStyles", TemplateHelper.class, styles);
        }

        return ZVal.assign(this.htmlDumper);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object dump(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object output = null;
        Object cloneVar = null;
        Object dumper = null;
        dumper = this.getDumper(env);
        if (ZVal.isTrue(dumper)) {
            if (function_class_exists
                    .f
                    .env(env)
                    .call("Symfony\\Component\\VarDumper\\Caster\\Caster")
                    .getBool()) {
                cloneVar =
                        env.callMethod(
                                this.getCloner(env),
                                "cloneVar",
                                TemplateHelper.class,
                                value,
                                Caster.CONST_EXCLUDE_VERBOSE);

            } else {
                cloneVar =
                        env.callMethod(
                                this.getCloner(env), "cloneVar", TemplateHelper.class, value);
            }

            env.callMethod(dumper, "dump", TemplateHelper.class, cloneVar, this.htmlDumperOutput);
            output = env.callMethod(this.htmlDumperOutput, "getOutput", TemplateHelper.class);
            env.callMethod(this.htmlDumperOutput, "clear", TemplateHelper.class);
            return ZVal.assign(output);
        }

        return ZVal.assign(
                NamespaceGlobal.htmlspecialchars
                        .env(env)
                        .call(NamespaceGlobal.print_r.env(env).call(value, true).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frame", typeHint = "Whoops\\Exception\\Frame")
    public Object dumpArgs(RuntimeEnv env, Object... args) {
        Object frame = assignParameter(args, 0, false);
        Object numFrames = null;
        Object html = null;
        Object frameArg = null;
        Object j = null;
        if (!ZVal.isTrue(this.getDumper(env))) {
            return "";
        }

        html = "";
        numFrames =
                function_count
                        .f
                        .env(env)
                        .call(env.callMethod(frame, "getArgs", TemplateHelper.class))
                        .value();
        if (ZVal.isGreaterThan(numFrames, '>', 0)) {
            html = "<ol class=\"linenums\">";
            for (ZPair zpairResult63 :
                    ZVal.getIterable(
                            env.callMethod(frame, "getArgs", TemplateHelper.class), env, false)) {
                j = ZVal.assign(zpairResult63.getKey());
                frameArg = ZVal.assign(zpairResult63.getValue());
                html =
                        toStringR(html, env)
                                + "<li>"
                                + toStringR(this.dump(env, frameArg), env)
                                + "</li>";
            }

            html = toStringR(html, env) + "</ol>";
        }

        return ZVal.assign(html);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "original")
    public Object slug(RuntimeEnv env, Object... args) {
        Object original = assignParameter(args, 0, false);
        Object slug = null;
        slug = function_str_replace.f.env(env).call(" ", "-", original).value();
        slug = function_preg_replace.f.env(env).call("/[^\\w\\d\\-\\_]/i", "", slug).value();
        return ZVal.assign(NamespaceGlobal.strtolower.env(env).call(slug).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template")
    @ConvertedParameter(
        index = 1,
        name = "additionalVariables",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object render(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops/Util")
                        .setFile("/vendor/filp/whoops/src/Whoops/Util/TemplateHelper.php");
        Object template = assignParameter(args, 0, false);
        Object additionalVariables = assignParameter(args, 1, true);
        if (null == additionalVariables) {
            additionalVariables = ZVal.getNull();
        }
        ReferenceContainer variables = new BasicReferenceContainer(null);
        variables.setObject(this.getVariables(env));
        variables.arrayAccess(env, "tpl").set(this);
        if (ZVal.strictNotEqualityCheck(additionalVariables, "!==", ZVal.getNull())) {
            variables.setObject(
                    function_array_replace
                            .f
                            .env(env)
                            .call(variables.getObject(), additionalVariables)
                            .value());
        }

        function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        new Closure(
                                env, runtimeConverterFunctionClassConstants, "Whoops\\Util", this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ContextConstants runtimeConverterFunctionClassConstants =
                                        new ContextConstants()
                                                .setDir("/vendor/filp/whoops/src/Whoops/Util")
                                                .setFile(
                                                        "/vendor/filp/whoops/src/Whoops/Util/TemplateHelper.php");
                                RuntimeStack stack = new RuntimeStack();
                                stack.setupGlobals(env);
                                Scope76 scope = new Scope76();
                                stack.pushScope(scope);
                                scope._thisVarAlias = this;
                                try {
                                    Object _closureThisVar = this.getClosureThisVar();
                                    function_extract
                                            .f
                                            .env(env)
                                            .call(
                                                    stack,
                                                    function_func_get_arg
                                                            .f
                                                            .env(env)
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithInfo(
                                                                            args, this))
                                                            .call(1)
                                                            .value());
                                    env.include(
                                            toStringR(
                                                    function_func_get_arg
                                                            .f
                                                            .env(env)
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithInfo(
                                                                            args, this))
                                                            .call(0)
                                                            .value(),
                                                    env),
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            true,
                                            false);
                                    throw new IncludeEventException(null);
                                } catch (IncludeEventException runtimeConverterIncludeException) {
                                    return runtimeConverterIncludeException.returnValue;
                                }
                            }
                        },
                        template,
                        variables.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variables", typeHint = "array")
    public Object setVariables(RuntimeEnv env, Object... args) {
        Object variables = assignParameter(args, 0, false);
        this.variables = variables;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variableName")
    @ConvertedParameter(index = 1, name = "variableValue")
    public Object setVariable(RuntimeEnv env, Object... args) {
        Object variableName = assignParameter(args, 0, false);
        Object variableValue = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "variables", env)
                .arrayAccess(env, variableName)
                .set(variableValue);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variableName")
    @ConvertedParameter(
        index = 1,
        name = "defaultValue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getVariable(RuntimeEnv env, Object... args) {
        Object variableName = assignParameter(args, 0, false);
        Object defaultValue = assignParameter(args, 1, true);
        if (null == defaultValue) {
            defaultValue = ZVal.getNull();
        }
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "variables", env),
                                env,
                                variableName)
                        ? new ReferenceClassProperty(this, "variables", env)
                                .arrayGet(env, variableName)
                        : defaultValue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variableName")
    public Object delVariable(RuntimeEnv env, Object... args) {
        Object variableName = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "variables", env),
                env,
                variableName);
        return null;
    }

    @ConvertedMethod
    public Object getVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.variables);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cloner")
    public Object setCloner(RuntimeEnv env, Object... args) {
        Object cloner = assignParameter(args, 0, false);
        this.cloner = cloner;
        return null;
    }

    @ConvertedMethod
    public Object getCloner(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.cloner)) {
            this.cloner = new VarCloner(env);
        }

        return ZVal.assign(this.cloner);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "applicationRootPath")
    public Object setApplicationRootPath(RuntimeEnv env, Object... args) {
        Object applicationRootPath = assignParameter(args, 0, false);
        this.applicationRootPath = applicationRootPath;
        return null;
    }

    @ConvertedMethod
    public Object getApplicationRootPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.applicationRootPath);
    }

    public static final Object CONST_class = "Whoops\\Util\\TemplateHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Util\\TemplateHelper")
                    .setLookup(
                            TemplateHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "applicationRootPath",
                            "cloner",
                            "htmlDumper",
                            "htmlDumperOutput",
                            "variables")
                    .setFilename("vendor/filp/whoops/src/Whoops/Util/TemplateHelper.php")
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

    private static class Scope11 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
        }
    }

    private static class Scope76 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
