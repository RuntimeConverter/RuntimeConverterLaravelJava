package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import java.lang.Class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/RegisterControllerArgumentLocatorsPass.php

*/

public class RegisterControllerArgumentLocatorsPass extends RuntimeClassBase {

    public Object resolverServiceId = null;

    public Object controllerTag = null;

    public Object controllerLocator = null;

    public RegisterControllerArgumentLocatorsPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RegisterControllerArgumentLocatorsPass.class) {
            this.__construct(env, args);
        }
    }

    public RegisterControllerArgumentLocatorsPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolverServiceId", typeHint = "string")
    @ConvertedParameter(index = 1, name = "controllerTag", typeHint = "string")
    @ConvertedParameter(index = 2, name = "controllerLocator", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resolverServiceId = assignParameter(args, 0, true);
        if (null == resolverServiceId) {
            resolverServiceId = "argument_resolver.service";
        }
        Object controllerTag = assignParameter(args, 1, true);
        if (null == controllerTag) {
            controllerTag = "controller.service_arguments";
        }
        Object controllerLocator = assignParameter(args, 2, true);
        if (null == controllerLocator) {
            controllerLocator = "argument_resolver.controller_locator";
        }
        this.resolverServiceId = resolverServiceId;
        this.controllerTag = controllerTag;
        this.controllerLocator = controllerLocator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object container = assignParameter(args, 0, false);
        Object def = null;
        ReferenceContainer methods = new BasicReferenceContainer(null);
        ReferenceContainer bindings = new BasicReferenceContainer(null);
        Object binding = null;
        Object type = null;
        Object bindingName = null;
        Object controllerLocatorRef = null;
        Object found = null;
        Object invalidBehavior = null;
        ReferenceContainer controllers = new BasicReferenceContainer(null);
        Object action = null;
        Object id = null;
        Object bindingId = null;
        Object _pClass = null;
        Object isContainerAware = null;
        Object bindingValue = null;
        Object autowire = null;
        Object ternaryExpressionTemp = null;
        Object k = null;
        Object message = null;
        Object tags = null;
        ReferenceContainer target = new BasicReferenceContainer(null);
        Object p = null;
        ReferenceContainer ___args = new BasicReferenceContainer(null);
        Object parameterBag = null;
        Object r = null;
        Object runtimeTempArrayResult195 = null;
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object parameters = null;
        Object runtimeTempArrayResult197 = null;
        Object runtimeTempArrayResult196 = null;
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                env.callMethod(
                        container,
                        "hasDefinition",
                        RegisterControllerArgumentLocatorsPass.class,
                        this.resolverServiceId))) {
            return null;
        }

        parameterBag =
                env.callMethod(
                        container, "getParameterBag", RegisterControllerArgumentLocatorsPass.class);
        controllers.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1935 :
                ZVal.getIterable(
                        env.callMethod(
                                container,
                                "findTaggedServiceIds",
                                RegisterControllerArgumentLocatorsPass.class,
                                this.controllerTag,
                                true),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult1935.getKey());
            tags = ZVal.assign(zpairResult1935.getValue());
            def =
                    env.callMethod(
                            container,
                            "getDefinition",
                            RegisterControllerArgumentLocatorsPass.class,
                            id);
            env.callMethod(def, "setPublic", RegisterControllerArgumentLocatorsPass.class, true);
            _pClass = env.callMethod(def, "getClass", RegisterControllerArgumentLocatorsPass.class);
            autowire =
                    env.callMethod(
                            def, "isAutowired", RegisterControllerArgumentLocatorsPass.class);
            bindings.setObject(
                    env.callMethod(
                            def, "getBindings", RegisterControllerArgumentLocatorsPass.class));
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            while (ZVal.isTrue(ZVal.checkInstanceType(def, (Class) null, "ChildDefinition", env))) {
                def =
                        env.callMethod(
                                container,
                                "findDefinition",
                                RegisterControllerArgumentLocatorsPass.class,
                                env.callMethod(
                                        def,
                                        "getParent",
                                        RegisterControllerArgumentLocatorsPass.class));
                _pClass =
                        ZVal.assign(
                                ZVal.isTrue(ternaryExpressionTemp = _pClass)
                                        ? ternaryExpressionTemp
                                        : env.callMethod(
                                                def,
                                                "getClass",
                                                RegisterControllerArgumentLocatorsPass.class));
                bindings.setObject(
                        env.callMethod(
                                def, "getBindings", RegisterControllerArgumentLocatorsPass.class));
            }

            _pClass =
                    env.callMethod(
                            parameterBag,
                            "resolveValue",
                            RegisterControllerArgumentLocatorsPass.class,
                            _pClass);
            if (!ZVal.isTrue(
                    r =
                            env.callMethod(
                                    container,
                                    "getReflectionClass",
                                    RegisterControllerArgumentLocatorsPass.class,
                                    _pClass))) {
                throw ZVal.getException(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Class \"%s\" used for service \"%s\" cannot be found.",
                                                _pClass, id)
                                        .value()));
            }

            isContainerAware =
                    ZVal.toBool(
                                    env.callMethod(
                                            r,
                                            "implementsInterface",
                                            RegisterControllerArgumentLocatorsPass.class,
                                            "Symfony\\Component\\DependencyInjection\\ContainerAwareInterface"))
                            || ZVal.toBool(
                                    NamespaceGlobal.is_subclass_of
                                            .env(env)
                                            .call(
                                                    _pClass,
                                                    "Symfony\\Bundle\\FrameworkBundle\\Controller\\AbstractController")
                                            .value());
            methods.setObject(ZVal.newArray());
            arguments.setObject(ZVal.newArray());
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1936 :
                    ZVal.getIterable(
                            env.callMethod(
                                    r,
                                    "getMethods",
                                    RegisterControllerArgumentLocatorsPass.class,
                                    256),
                            env,
                            true)) {
                r = ZVal.assign(zpairResult1936.getValue());
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "setContainer",
                                        "===",
                                        toObjectR(r).accessProp(this, env).name("name").value()))
                        && ZVal.toBool(isContainerAware)) {
                    continue;
                }

                if (ZVal.toBool(
                                ZVal.toBool(
                                                !ZVal.isTrue(
                                                        env.callMethod(
                                                                r,
                                                                "isConstructor",
                                                                RegisterControllerArgumentLocatorsPass
                                                                        .class)))
                                        && ZVal.toBool(
                                                !ZVal.isTrue(
                                                        env.callMethod(
                                                                r,
                                                                "isDestructor",
                                                                RegisterControllerArgumentLocatorsPass
                                                                        .class))))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                r,
                                                "isAbstract",
                                                RegisterControllerArgumentLocatorsPass.class)))) {
                    methods.arrayAccess(
                                    env,
                                    NamespaceGlobal.strtolower
                                            .env(env)
                                            .call(
                                                    toObjectR(r)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())
                                            .value())
                            .set(
                                    ZVal.newArray(
                                            new ZPair(0, r),
                                            new ZPair(
                                                    1,
                                                    env.callMethod(
                                                            r,
                                                            "getParameters",
                                                            RegisterControllerArgumentLocatorsPass
                                                                    .class))));
                }
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1937 : ZVal.getIterable(tags, env, true)) {
                attributes.setObject(ZVal.assign(zpairResult1937.getValue()));
                if (ZVal.toBool(
                                ZVal.toBool(
                                                !arrayActionR(
                                                        ArrayAction.ISSET,
                                                        attributes,
                                                        env,
                                                        "action"))
                                        && ZVal.toBool(
                                                !arrayActionR(
                                                        ArrayAction.ISSET,
                                                        attributes,
                                                        env,
                                                        "argument")))
                        && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, attributes, env, "id"))) {
                    autowire = true;
                    continue;
                }

                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1938 :
                        ZVal.getIterable(
                                ZVal.arrayFromList("action", "argument", "id"), env, true)) {
                    k = ZVal.assign(zpairResult1938.getValue());
                    if (!arrayActionR(ArrayAction.ISSET, attributes, env, k, 0)) {
                        throw ZVal.getException(
                                env,
                                env.createNew(
                                        ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Missing \"%s\" attribute on tag \"%s\" %s for service \"%s\".",
                                                        k,
                                                        this.controllerTag,
                                                        NamespaceGlobal.json_encode
                                                                .env(env)
                                                                .call(attributes.getObject(), 256)
                                                                .value(),
                                                        id)
                                                .value()));
                    }
                }

                if (!arrayActionR(
                        ArrayAction.ISSET,
                        methods,
                        env,
                        action =
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(attributes.arrayGet(env, "action"))
                                        .value())) {
                    throw ZVal.getException(
                            env,
                            env.createNew(
                                    ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Invalid \"action\" attribute on tag \"%s\" for service \"%s\": no public \"%s()\" method found on class \"%s\".",
                                                    this.controllerTag,
                                                    id,
                                                    attributes.arrayGet(env, "action"),
                                                    _pClass)
                                            .value()));
                }

                ZVal.list(
                        runtimeTempArrayResult195 = methods.arrayGet(env, action),
                        (r = listGet(runtimeTempArrayResult195, 0, env)),
                        (parameters = listGet(runtimeTempArrayResult195, 1, env)));
                found = false;
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1939 : ZVal.getIterable(parameters, env, true)) {
                    p = ZVal.assign(zpairResult1939.getValue());
                    if (ZVal.strictEqualityCheck(
                            attributes.arrayGet(env, "argument"),
                            "===",
                            toObjectR(p).accessProp(this, env).name("name").value())) {
                        if (!arrayActionR(
                                ArrayAction.ISSET,
                                arguments,
                                env,
                                toObjectR(r).accessProp(this, env).name("name").value(),
                                toObjectR(p).accessProp(this, env).name("name").value())) {
                            arguments
                                    .arrayAccess(
                                            env,
                                            toObjectR(r).accessProp(this, env).name("name").value(),
                                            toObjectR(p).accessProp(this, env).name("name").value())
                                    .set(attributes.arrayGet(env, "id"));
                        }

                        found = true;
                        break;
                    }
                }

                if (!ZVal.isTrue(found)) {
                    throw ZVal.getException(
                            env,
                            env.createNew(
                                    ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Invalid \"%s\" tag for service \"%s\": method \"%s()\" has no \"%s\" argument on class \"%s\".",
                                                    this.controllerTag,
                                                    id,
                                                    toObjectR(r)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    attributes.arrayGet(env, "argument"),
                                                    _pClass)
                                            .value()));
                }
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1940 : ZVal.getIterable(methods.getObject(), env, true)) {
                ZVal.list(
                        runtimeTempArrayResult197 = zpairResult1940.getValue(),
                        (r = listGet(runtimeTempArrayResult197, 0, env)),
                        (parameters = listGet(runtimeTempArrayResult197, 1, env)));
                ___args.setObject(ZVal.newArray());
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1941 : ZVal.getIterable(parameters, env, true)) {
                    p = ZVal.assign(zpairResult1941.getValue());
                    type =
                            ZVal.assign(
                                    target.setObject(
                                            StaticMethodUtils.getStaticBaseClass(
                                                            ZVal.resolveClassAlias(
                                                                    env, "ProxyHelper"),
                                                            env)
                                                    .callUnknownStaticMethod(
                                                            env,
                                                            "getTypeHint",
                                                            new RuntimeArgsWithReferences(),
                                                            r,
                                                            p,
                                                            true)));
                    invalidBehavior =
                            ZVal.assign(
                                    ClassConstantUtils.getConstantValueByClass(
                                            env,
                                            ZVal.resolveClassAlias(env, "ContainerInterface"),
                                            "IGNORE_ON_INVALID_REFERENCE"));
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            arguments,
                            env,
                            toObjectR(r).accessProp(this, env).name("name").value(),
                            toObjectR(p).accessProp(this, env).name("name").value())) {
                        target.setObject(
                                ZVal.assign(
                                        arguments.arrayGet(
                                                env,
                                                toObjectR(r)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                toObjectR(p)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value())));
                        if (ZVal.strictNotEqualityCheck("?", "!==", target.arrayGet(env, 0))) {
                            invalidBehavior =
                                    ZVal.assign(
                                            ClassConstantUtils.getConstantValueByClass(
                                                    env,
                                                    ZVal.resolveClassAlias(
                                                            env, "ContainerInterface"),
                                                    "RUNTIME_EXCEPTION_ON_INVALID_REFERENCE"));

                        } else if (ZVal.strictEqualityCheck(
                                "",
                                "===",
                                target.setObject(
                                        ZVal.assign(
                                                toStringR(
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(target.getObject(), 1)
                                                                .value(),
                                                        env))))) {
                            throw ZVal.getException(
                                    env,
                                    env.createNew(
                                            ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "A \"%s\" tag must have non-empty \"id\" attributes for service \"%s\".",
                                                            this.controllerTag, id)
                                                    .value()));

                        } else if (ZVal.toBool(
                                        env.callMethod(
                                                p,
                                                "allowsNull",
                                                RegisterControllerArgumentLocatorsPass.class))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        p,
                                                        "isOptional",
                                                        RegisterControllerArgumentLocatorsPass
                                                                .class)))) {
                            invalidBehavior =
                                    ZVal.assign(
                                            ClassConstantUtils.getConstantValueByClass(
                                                    env,
                                                    ZVal.resolveClassAlias(
                                                            env, "ContainerInterface"),
                                                    "NULL_ON_INVALID_REFERENCE"));
                        }

                    } else if (ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            bindings,
                                            env,
                                            bindingName =
                                                    "$"
                                                            + toStringR(
                                                                    toObjectR(p)
                                                                            .accessProp(this, env)
                                                                            .name("name")
                                                                            .value(),
                                                                    env)))
                            || ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            bindings,
                                            env,
                                            bindingName = ZVal.assign(type)))) {
                        binding = ZVal.assign(bindings.arrayGet(env, bindingName));
                        ZVal.list(
                                runtimeTempArrayResult196 =
                                        env.callMethod(
                                                binding,
                                                "getValues",
                                                RegisterControllerArgumentLocatorsPass.class),
                                (bindingValue = listGet(runtimeTempArrayResult196, 0, env)),
                                (bindingId = listGet(runtimeTempArrayResult196, 1, env)));
                        env.callMethod(
                                binding,
                                "setValues",
                                RegisterControllerArgumentLocatorsPass.class,
                                ZVal.newArray(
                                        new ZPair(0, bindingValue),
                                        new ZPair(1, bindingId),
                                        new ZPair(2, true)));
                        if (!ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        bindingValue, (Class) null, "Reference", env))) {
                            ___args.arrayAccess(
                                            env,
                                            toObjectR(p).accessProp(this, env).name("name").value())
                                    .set(
                                            env.createNew(
                                                    ZVal.resolveClassAlias(env, "Reference"),
                                                    ".value."
                                                            + toStringR(
                                                                    env.callMethod(
                                                                            container,
                                                                            "hash",
                                                                            RegisterControllerArgumentLocatorsPass
                                                                                    .class,
                                                                            bindingValue),
                                                                    env)));
                            env.callMethod(
                                    env.callMethod(
                                            env.callMethod(
                                                    container,
                                                    "register",
                                                    RegisterControllerArgumentLocatorsPass.class,
                                                    toStringR(
                                                            ___args.arrayGet(
                                                                    env,
                                                                    toObjectR(p)
                                                                            .accessProp(this, env)
                                                                            .name("name")
                                                                            .value()),
                                                            env),
                                                    "mixed"),
                                            "setFactory",
                                            RegisterControllerArgumentLocatorsPass.class,
                                            "current"),
                                    "addArgument",
                                    RegisterControllerArgumentLocatorsPass.class,
                                    ZVal.newArray(new ZPair(0, bindingValue)));

                        } else {
                            ___args.arrayAccess(
                                            env,
                                            toObjectR(p).accessProp(this, env).name("name").value())
                                    .set(bindingValue);
                        }

                        continue;

                    } else if (ZVal.toBool(!ZVal.isTrue(type))
                            || ZVal.toBool(!ZVal.isTrue(autowire))) {
                        continue;

                    } else if (!ZVal.isTrue(
                            env.callMethod(
                                    p,
                                    "allowsNull",
                                    RegisterControllerArgumentLocatorsPass.class))) {
                        invalidBehavior =
                                ZVal.assign(
                                        ClassConstantUtils.getConstantValueByClass(
                                                env,
                                                ZVal.resolveClassAlias(env, "ContainerInterface"),
                                                "RUNTIME_EXCEPTION_ON_INVALID_REFERENCE"));
                    }

                    if (ZVal.strictEqualityCheck(Request.CONST_class, "===", type)) {
                        continue;
                    }

                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.toBool(type)
                                                                            && ZVal.toBool(
                                                                                    !ZVal.isTrue(
                                                                                            env
                                                                                                    .callMethod(
                                                                                                            p,
                                                                                                            "isOptional",
                                                                                                            RegisterControllerArgumentLocatorsPass
                                                                                                                    .class))))
                                                            && ZVal.toBool(
                                                                    !ZVal.isTrue(
                                                                            env.callMethod(
                                                                                    p,
                                                                                    "allowsNull",
                                                                                    RegisterControllerArgumentLocatorsPass
                                                                                            .class))))
                                            && ZVal.toBool(
                                                    !function_class_exists
                                                            .f
                                                            .env(env)
                                                            .call(type)
                                                            .getBool()))
                            && ZVal.toBool(
                                    !NamespaceGlobal.interface_exists
                                            .env(env)
                                            .call(type, false)
                                            .getBool())) {
                        message =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Cannot determine controller argument for \"%s::%s()\": the $%s argument is type-hinted with the non-existent class or interface: \"%s\".",
                                                _pClass,
                                                toObjectR(r)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                toObjectR(p)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                type)
                                        .value();
                        if (ZVal.strictEqualityCheck(
                                0,
                                "===",
                                NamespaceGlobal.strncmp
                                        .env(env)
                                        .call(
                                                type,
                                                _pClass,
                                                NamespaceGlobal.strrpos
                                                        .env(env)
                                                        .call(_pClass, "\\")
                                                        .value())
                                        .value())) {
                            message =
                                    toStringR(message, env)
                                            + " Did you forget to add a use statement?";
                        }

                        throw ZVal.getException(
                                env,
                                env.createNew(
                                        ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                        message));
                    }

                    ___args.arrayAccess(
                                    env, toObjectR(p).accessProp(this, env).name("name").value())
                            .set(
                                    ZVal.isTrue(type)
                                            ? env.createNew(
                                                    ZVal.resolveClassAlias(env, "TypedReference"),
                                                    target.getObject(),
                                                    type,
                                                    invalidBehavior)
                                            : env.createNew(
                                                    ZVal.resolveClassAlias(env, "Reference"),
                                                    target.getObject(),
                                                    invalidBehavior));
                }

                if (ZVal.isTrue(___args.getObject())) {
                    controllers
                            .arrayAccess(
                                    env,
                                    toStringR(id, env)
                                            + "::"
                                            + toStringR(
                                                    toObjectR(r)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    env))
                            .set(
                                    StaticMethodUtils.getStaticBaseClass(
                                                    ZVal.resolveClassAlias(
                                                            env, "ServiceLocatorTagPass"),
                                                    env)
                                            .callUnknownStaticMethod(
                                                    env,
                                                    "register",
                                                    new RuntimeArgsWithReferences(),
                                                    container,
                                                    ___args.getObject()));
                }
            }
        }

        env.callMethod(
                env.callMethod(
                        container,
                        "getDefinition",
                        RegisterControllerArgumentLocatorsPass.class,
                        this.resolverServiceId),
                "replaceArgument",
                RegisterControllerArgumentLocatorsPass.class,
                0,
                controllerLocatorRef =
                        StaticMethodUtils.getStaticBaseClass(
                                        ZVal.resolveClassAlias(env, "ServiceLocatorTagPass"), env)
                                .callUnknownStaticMethod(
                                        env,
                                        "register",
                                        new RuntimeArgsWithReferences(),
                                        container,
                                        controllers.getObject()));
        env.callMethod(
                container,
                "setAlias",
                RegisterControllerArgumentLocatorsPass.class,
                this.controllerLocator,
                toStringR(controllerLocatorRef, env));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\RegisterControllerArgumentLocatorsPass";

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
                    .setName(
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\RegisterControllerArgumentLocatorsPass")
                    .setLookup(
                            RegisterControllerArgumentLocatorsPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("controllerLocator", "controllerTag", "resolverServiceId")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/RegisterControllerArgumentLocatorsPass.php")
                    .addInterface("CompilerPassInterface")
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
