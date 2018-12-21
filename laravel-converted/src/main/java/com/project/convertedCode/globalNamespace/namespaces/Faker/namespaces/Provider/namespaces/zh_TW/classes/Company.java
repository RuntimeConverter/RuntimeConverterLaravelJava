package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_TW.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/zh_TW/Company.php

*/

public class Company
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Company {

    public Company(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Company.class) {
            this.__construct(env, args);
        }
    }

    public Company(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object companyEn(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .zh_TW
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "companyEnFormats")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .namespaces
                                                        .zh_TW
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .companyEnFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Company.class,
                        format));
    }

    @ConvertedMethod
    public Object catchPhrase(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .zh_TW
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "catchPhrase")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .namespaces
                                                        .zh_TW
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .catchPhrase)
                        .value());
    }

    @ConvertedMethod
    public Object bs(RuntimeEnv env, Object... args) {
        Object result = null;
        ReferenceContainer word = new BasicReferenceContainer(null);
        result = "";
        for (ZPair zpairResult135 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .zh_TW
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .bsWords,
                        env,
                        true)) {
            word = zpairResult135;
            result =
                    toStringR(result, env)
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Company.class)
                                            .method("randomElement")
                                            .addReferenceArgs(
                                                    new RuntimeArgsWithReferences().add(0, word))
                                            .call(word.getObject())
                                            .value(),
                                    env);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object VAT(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                        .method("randomNumber")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(8, true)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\zh_TW\\Company";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .Company
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object companyEnSuffix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .zh_TW
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyEnSuffix)
                            .value());
        }

        @ConvertedMethod
        public Object companyModifier(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .zh_TW
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyModifier)
                            .value());
        }

        @ConvertedMethod
        public Object companyPrefix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .zh_TW
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyPrefix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object companyEnSuffix =
                ZVal.arrayFromList("Inc", "and Sons", "LLC", "Group", "PLC", "Ltd");

        public Object companyEnFormats =
                ZVal.arrayFromList(
                        "{{lastNameEn}} {{companyEnSuffix}}",
                        "{{lastNameEn}}-{{lastNameEn}}",
                        "{{lastNameEn}}, {{lastNameEn}} and {{lastNameEn}}");

        public Object formats =
                ZVal.arrayFromList(
                        "{{companyPrefix}}{{companyModifier}}",
                        "{{companyPrefix}}{{companySuffix}}",
                        "{{companyPrefix}}{{companyModifier}}{{CompanySuffix}}");

        public Object companyPrefix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u4E7E\u5764",
                                    "\u4E9E\u795E",
                                    "\u5149\u8B5C",
                                    "\u5178\u9078",
                                    "\u51F1\u57FA",
                                    "\u524D\u885B\u82B1\u5712",
                                    "\u5275\u898B",
                                    "\u53CB\u8A0A",
                                    "\u53F0\u9054",
                                    "\u5408\u52E4",
                                    "\u559C\u746A\u62C9\u96C5",
                                    "\u55AC\u5C71",
                                    "\u591A\u5229\u5B89",
                                    "\u5927\u570B",
                                    "\u5927\u5B87",
                                    "\u592A\u967D",
                                    "\u592A\u967D\u52D5\u529B",
                                    "\u5B8F\u7881",
                                    "\u5B8F\u9054",
                                    "\u5C0F\u767D\u5154",
                                    "\u5DE8\u5927",
                                    "\u5DE8\u5BA4",
                                    "\u5EB7\u5E2B\u5085",
                                    "\u5EF6\u4F38",
                                    "\u5F18\u715C",
                                    "\u5F4E\u7684",
                                    "\u64CE\u5929",
                                    "\u65B0\u4E9E\u6D32",
                                    "\u65FA\u65FA",
                                    "\u6631\u6CC9",
                                    "\u667A\u51A0",
                                    "\u672A\u4F86",
                                    "\u677E\u5D17",
                                    "\u6B63\u65B0",
                                    "\u6D27\u8AA0",
                                    "\u6D77\u8776",
                                    "\u6DFB\u7FFC\u5275\u8D8A",
                                    "\u6EFE\u77F3",
                                    "\u738B\u54C1",
                                    "\u7576\u7136",
                                    "\u76F8\u4FE1",
                                    "\u775B\u6C34",
                                    "\u7814\u83EF",
                                    "\u798F\u8302",
                                    "\u7A2E\u5B50",
                                    "\u7C73\u6A02\u58EB",
                                    "\u7D05\u5143\u7D20",
                                    "\u7D05\u5FC3\u8FA3\u6912",
                                    "\u7D71\u4E00",
                                    "\u7F8E\u5229\u9054",
                                    "\u7F8E\u5999",
                                    "\u7F8E\u6A02\u5E1D",
                                    "\u7FA4\u77F3",
                                    "\u8001\u9DF9",
                                    "\u806F\u5F37",
                                    "\u82AE\u6CB3",
                                    "\u82F1\u7279\u885B",
                                    "\u8302\u70BA",
                                    "\u83EF\u7279",
                                    "\u83EF\u7814",
                                    "\u83EF\u78A9",
                                    "\u83EF\u7FA9",
                                    "\u89D2\u982D",
                                    "\u8A0A\u9023",
                                    "\u8C50\u83EF",
                                    "\u8C6A\u5BA2",
                                    "\u8C6A\u8A18",
                                    "\u8CB4\u65CF",
                                    "\u8DA8\u52E2",
                                    "\u904A\u6232\u6A58\u5B50",
                                    "\u91CE\u706B\u6A02\u96C6",
                                    "\u91D1\u9769",
                                    "\u9280\u9B5A",
                                    "\u963F\u723E\u767C",
                                    "\u98A8\u548C\u65E5\u9E97",
                                    "\u98A8\u6F6E",
                                    "\u98A8\u96F2");
                        });

        public Object companyModifier =
                ZVal.arrayFromList(
                        "\u79D1\u6280",
                        "\u96FB\u8166",
                        "\u570B\u969B",
                        "\u96FB\u5B50",
                        "\u5A1B\u6A02",
                        "\u97F3\u6A02",
                        "\u5531\u7247",
                        "\u8B49\u5238",
                        "\u96C6\u5718",
                        "\u4F01\u696D",
                        "\u6A5F\u68B0",
                        "\u5DE5\u696D",
                        "\u6587\u5316",
                        "\u6C7D\u8ECA",
                        "\u767E\u8CA8",
                        "\u9152\u5E97",
                        "\u6578\u4F4D");

        public Object companySuffix =
                ZVal.arrayFromList(
                        "\u516C\u53F8",
                        "\u6709\u9650\u516C\u53F8",
                        "\u80A1\u4EFD\u6709\u9650\u516C\u53F8");

        public Object catchPhrase =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Everything's ok",
                                    "Just call me be happy",
                                    "Keep Walking",
                                    "NOKIA\u76F8\u4FE1\u79D1\u6280\u59CB\u7D42\u4F86\u81EA\u65BC\u4EBA\u6027",
                                    "PayEasy\uFF0C\u966A\u4F60Shopping\u4E00\u8F29\u5B50",
                                    "Play\u4E0D\u7D2F",
                                    "The city never sleeps",
                                    "Trust me, you can make it!",
                                    "We are family",
                                    "We share",
                                    "You A.S.O beautiful",
                                    "\u4E00\u4EBA\u5403\uFF0C\u5169\u4EBA\u88DC",
                                    "\u4E00\u5B9A\u8981\u5E78\u798F\u54E6\uFF01",
                                    "\u4E00\u628A\u62B5\u5169\u628A\uFF0C\u4F55\u9700\u746A\u9E97\u4E9E\uFF1F\uFF01",
                                    "\u4E00\u6B21\u8CB7\u597D\uFF0C\u5C31\u662F\u9802\u597D",
                                    "\u4E00\u6B65\u4E00\u8173\u5370\uFF0C\u5927\u5BB6\u611B\u53F0\u7063",
                                    "\u4E00\u6BB5\u8A71\uFF0C\u611F\u52D5\u4E86\u4E00\u5E45\u756B\uFF01",
                                    "\u4E00\u9EDE\u4E00\u9EDE \u7D2F\u7A4D\u66F4\u597D\u7684\u81EA\u5DF1",
                                    "\u4E09\u4E0D\u4E94\u6642\uFF0C\u611B\u8981\u53CA\u6642",
                                    "\u4E09\u9910\u8001\u662F\u5728\u5916\uFF0C\u4EBA\u4EBA\u53EB\u6211\u8001\u5916\uFF01",
                                    "\u4E0D\u53EA\u8FA6\u516C\u5BA4\uFF0C\u638C\u63E1\u66F4\u591A\u4E8B",
                                    "\u4E0D\u5728\u4E4E\u5929\u9577\u5730\u4E45\uFF0C\u53EA\u5728\u4E4E\u66FE\u7D93\u64C1\u6709",
                                    "\u4E0D\u5728\u8FA6\u516C\u5BA4\uFF0C\u4E5F\u80FD\u8FA6\u516C\u4E8B",
                                    "\u4E0D\u5E73\u51E1\u7684\u5E73\u51E1\u5927\u773E",
                                    "\u4E0D\u60F3\u5206\u958B \u5C31\u6C38\u9060\u5728\u4E00\u8D77\u5427",
                                    "\u4E0D\u8A72\u611B\u7684\uFF0C\u8D81\u65E9\u63DB",
                                    "\u4E0D\u904E\uFF5E\u4E0D\u904E\uFF5E\uFF0C\u4E00\u5B9A\u6E2C\u4E0D\u904E",
                                    "\u4E16\u4E8B\u96E3\u6599\uFF0C\u5B89\u6CF0\u6BD4\u8F03\u597D",
                                    "\u4E16\u4E8B\u96E3\u6599\uFF0C\u5C0D\u4EBA\u8981\u66F4\u597D",
                                    "\u4E16\u754C\u4E0A\u6700\u91CD\u8981\u7684\u4E00\u90E8\u8ECA\u662F\u7238\u7238\u7684\u80A9\u8180",
                                    "\u4E4E\u4E7E\u5566\uFF01",
                                    "\u4EBA\u751F30\u8CA1\u958B\u59CB",
                                    "\u4EC0\u9EBC\u6700\u9752\uFF1F",
                                    "\u4EC0\u9EBC\u90FD\u6709\uFF0C\u4EC0\u9EBC\u90FD\u8CE3\uFF0C\u4EC0\u9EBC\u90FD\u4E0D\u5947\u602A\uFF01",
                                    "\u4ECA\u5929\u5FC3\u60C5\u5E7E\uFF1F",
                                    "\u4ED6\u50BB\u74DC\u3001\u4F60\u8070\u660E",
                                    "\u4ED6\u6349\u5F97\u4F4F\u6211",
                                    "\u4F60\u672A\u5FC5\u51FA\u985E\u62D4\u8403 \u4F46\u80AF\u5B9A\u8207\u773E\u4E0D\u540C",
                                    "\u4F60\u7684\u611B\uFF0C\u662F\u5B69\u5B50\u6700\u597D\u7684\u793A\u7BC4",
                                    "\u4F60\u8B1B\u53F0\u8A9E\u561B\u4E5F\u901A",
                                    "\u4FBF\u5B9C\u4E00\u6A23\u6709\u597D\u8CA8",
                                    "\u4FC2\u91D1A\uFF01",
                                    "\u4FE1\u4EFB\uFF0C\u5E36\u4F86\u65B0\u5E78\u798F",
                                    "\u4FE1\u7FA9\u623F\u5C4B\uFF0C\u4FE1\u4EFB\uFF0C\u5E36\u4F86\u65B0\u5E78\u798F",
                                    "\u505A\u4F60\u81EA\u5DF1\u624D\u53EB\u4E56\uFF0C\u505A\u4F60\u7684\u4E56\u4E56\uFF01",
                                    "\u505A\u81EA\u5DF1 \u81EA\u5DF1\u505A",
                                    "\u50BB\u74DC\u93E1\u7247,\u8070\u660E\u9078\u64C7",
                                    "\u304A\u5143\u6C17\u3067\u3059\u304B\uFF1F",
                                    "\u5168\u570B\u96FB\u5B50 \u8DB3\u611F\u5FC3\u311F",
                                    "\u5168\u5BB6\u5C31\u662F\u4F60\u5BB6",
                                    "\u518D\u5FD9\uFF0C\u4E5F\u8981\u548C\u4F60\u559D\u676F\u5496\u5561",
                                    "\u5225\u8B93\u4ECA\u5929\u7684\u61C9\u916C\u6210\u70BA\u660E\u5929\u7684\u8CA0\u64D4",
                                    "\u5230\u670D\u88DD\u5E97\u57F9\u990A\u6C23\u8CEA\uFF0C\u5230\u66F8\u5E97\u5C55\u793A\u670D\u88DD",
                                    "\u5316\u53BB\u5FC3\u4E2D\u90A3\u689D\u7DDA",
                                    "\u539F\u4F86\u6211\u5011\u9019\u9EBC\u8FD1",
                                    "\u53EA\u6709\u9060\u50B3\uFF0C\u6C92\u6709\u8DDD\u96E2",
                                    "\u53EA\u8981\u6709\u5922\uFF0C\u4F60\u6703\u7D05",
                                    "\u53EB\u5929\u5929\u4E0D\u5370 Canon\u5E6B\u4F60\u5370\uFF01",
                                    "\u53EF\u6190\u7684\u820A\u60C5\u4EBA\uFF0C\u770B\u4E0D\u5230\u6211\u7684\u65B0\u5167\u8863",
                                    "\u53F0\u7063\uFF0C\u52A0\u6CB9\uFF01",
                                    "\u5408\u5473\u624D\u6703\u5477\u610F",
                                    "\u554A\uFF01\u798F\u6C23\u5566\uFF01",
                                    "\u559C\u6B61\u55CE? \u7238\u7238\u8CB7\u7D66\u4F60!",
                                    "\u5695\u52A0\u5695\u597D\u5477",
                                    "\u56DE\u5BB6\u7684\u611F\u89BA\u771F\u597D",
                                    "\u56E0\u70BA\u4F60\u503C\u5F97 L\u2019ORE\u2019AL",
                                    "\u590F\u5929\u597D\u71B1 \u611B\u8981\u8D81\u71B1",
                                    "\u591A\u559D\u6C34\u6C92\u4E8B\uFF0C\u6C92\u4E8B\u591A\u559D\u6C34",
                                    "\u591C\u6DF1\u4E86\uFF0C\u6253\u500B\u96FB\u8A71\u56DE\u5BB6",
                                    "\u5929\u751F\u8D85\u4EBA\u6C23\uFF0C\u4E0D\u8A72\u906D\u4EBA\u68C4",
                                    "\u5973\u4EBA\u8AAA\u597D\uFF0C\u624D\u7B97\u9802\u597D",
                                    "\u597D\u6771\u897F\u548C\u597D\u670B\u53CB\u5206\u4EAB",
                                    "\u597D\u7684\u958B\u559C\u5C31\u662F\u6210\u529F\u7684\u4E00\u534A\uFF01",
                                    "\u597D\u8EAB\u9AD4\uFF0C\u6C92\u4EBA\u6562\u60F9\u4F60",
                                    "\u597D\u96AA\uFF0C\u6709\u5357\u5C71\uFF01",
                                    "\u5B69\u5B50\uFF01\u6211\u8981\u4F60\u5C07\u4F86\u6BD4\u6211\u5F37\uFF01",
                                    "\u5B78\u7434\u7684\u5B69\u5B50\u4E0D\u6703\u8B8A\u58DE",
                                    "\u5B89\u5168\u662F\u56DE\u5BB6\u552F\u4E00\u7684\u8DEF",
                                    "\u5C0F\u800C\u7F8E\u3001\u5C0F\u800C\u51B7\u3001\u5C0F\u800C\u7701",
                                    "\u5E78\u798F\u600E\u80FD\u8AAA\u4E0D\u7528",
                                    "\u5FC3\uFF0C\u662F\u4EBA\u751F\u6700\u5927\u7684\u6230\u5834",
                                    "\u60A8\u771F\u5167\u884C\uFF01",
                                    "\u60F3\u50CF\u529B\u662F\u4F60\u7684\u8D85\u80FD\u529B",
                                    "\u6148\u6BCD\u5FC3\u3001\u8C46\u8150\u5FC3",
                                    "\u6211\u4E0D\u8A8D\u8B58\u4F60\uFF0C\u4F46\u662F\u6211\u8B1D\u8B1D\u4F60\uFF01",
                                    "\u6211\u5C31\u662F\u8D85\u611B Send\uFF01",
                                    "\u6211\u7684\u516B\u5206\u65B0\u647A\u5B78\uFF01",
                                    "\u62CD\u8AB0\u50CF\u8AB0\uFF0C\u8AB0\u62CD\u8AB0\u8AB0\u90FD\u5F97\u50CF\u8AB0",
                                    "\u633A\u7ACB\uFF0C\u4E0D\u53EA\u633A\u962E \u4E5F\u633A\u6041",
                                    "\u6350\u8840\u4E00\u888B\uFF0C\u6551\u4EBA\u4E00\u547D",
                                    "\u64BC\u52D5\u5929\u4E0B\u7684\u529B\u91CF",
                                    "\u64CB\u4E0D\u4F4F\u7684\u611F\u89BA",
                                    "\u6574\u500B\u57CE\u5E02\u5C31\u662F\u6211\u7684\u5496\u5561\u9928",
                                    "\u6700\u4F73\u5973\u4E3B\u89D2\u63DB\u4F60\u505A\u505A\u770B",
                                    "\u6709\u5FC3\u6700\u8981\u7DCA",
                                    "\u6709\u66F8\u624D\u6703\u8D0F",
                                    "\u6709\u9752\u624D\u6562\u5927\u8072",
                                    "\u6709\u9EDE\u9ECF\u53C8\u4E0D\u6703\u592A\u9ECF",
                                    "\u671F\u5F85\u4E0B\u4E00\u6B21\uFF0C\u4E0D\u5982\u9760\u81EA\u5DF1",
                                    "\u672A\u4F86 \u5C31\u662F\u73FE\u5728",
                                    "\u6B63\u53CD\uFF0C\u53CD\u6B63\u90FD\u5F88\u6B63\uFF01",
                                    "\u6BCF\u4E00\u53E5\u8A71\uFF0C\u90FD\u662F\u601D\u5FF5",
                                    "\u6C92\u8AAA\u51FA\u53E3\u7684 \u4FDD\u8AA0\u4E5F\u807D\u5F97\u61C2",
                                    "\u73FE\u5728\u7684Nobody\uFF0C\u672A\u4F86\u7684Somebody\uFF01",
                                    "\u751F\u547D\u5C31\u8A72\u6D6A\u8CBB\u5728\u7F8E\u597D\u7684\u4E8B\u7269\u4E0A",
                                    "\u7528\u4F60\u60F3\u8981\u7684\u65B9\u5F0F\u9053\u5225",
                                    "\u7528\u5927\u91D1\uFF0C\u7701\u5927\u91D1",
                                    "\u7528\u597D\u5FC3\u8178\u505A\u597D\u9999\u8178",
                                    "\u7528\u611B\u6253\u6557\u4E0D\u666F\u6C23",
                                    "\u7528\u6700\u611B \u7167\u9867\u6700\u611B",
                                    "\u7559\u4E00\u76DE\u71C8\u7D66\u6700\u5F8C\u56DE\u5BB6\u7684\u4EBA",
                                    "\u767E\u670D\u5BE7\u3001\u4FDD\u8B77\u60A8",
                                    "\u771F\u611F\u60C5\u5C31\u662F\u6700\u597D\u7684\u670D\u52D9",
                                    "\u77E5\u8B58\u4F7F\u4F60\u66F4\u6709\u9B45\u529B",
                                    "\u78BC\u78BC\u90FD\u6709\u734E",
                                    "\u7BA1\u4ED6\u4EC0\u9EBC\u57A2\uFF0C\u4E00\u74F6\u5C31\u5920",
                                    "\u7D05\u5229\u9EDE\u6578\u4E5F\u80FD\u7576\u98EF\u5403",
                                    "\u7D19\u6709\u6625\u98A8\u6700\u6EAB\u67D4",
                                    "\u7D19\u8981Double A \u842C\u4E8B\u90FDOK\uFF01",
                                    "\u7D66\u4F60\u597D\u770B",
                                    "\u7D66\u6211\u5C0F\u5FC3\u9EDE\u5152",
                                    "\u809D\u54EA\u6C92\u597D\uFF0C\u4EBA\u751F\u662F\u9ED1\u767D\u7684\uFF01\u809D\u54EA\u9867\u597D\uFF0C\u4EBA\u751F\u662F\u5F69\u8272\u7684\uFF01",
                                    "\u809D\u82E6\u8AB0\u4EBA\u77E5",
                                    "\u842C\u4E8B\u7686\u53EF\u9054\uFF0C\u552F\u6709\u60C5\u7121\u50F9",
                                    "\u8A8D\u771F\u7684\u5973\u4EBA\u6700\u7F8E\u9E97",
                                    "\u8D0F\u7532\u5638\u77E5\u4EBA",
                                    "\u8DEF\uFF0C\u662FESCAPE\u8D70\u51FA\u4F86\u7684",
                                    "\u9019\u4E0D\u662F\u80AF\u5FB7\u57FA\uFF01",
                                    "\u9019\u500B\u6708\u4E0D\u6703\u4F86\uFF0C\u4E0B\u500B\u6708\u4E5F\u4E0D\u6703\u4F86\u4E86\uFF0C\u4EE5\u5F8C\u90FD\u4E0D\u6703\u4F86\u4E86",
                                    "\u9019\u662F\u4E00\u5B9A\u8981\u7684\u5566\uFF01",
                                    "\u9019\u7A2E\u6642\u6A5F\uFF0C\u7121\u9592\u4E5F\u662F\u4E00\u7A2E\u5E78\u798F",
                                    "\u9019\u7A2E\u9B3C\u5730\u65B9\u90FD\u6536\u5F97\u5230",
                                    "\u901A\u5F80\u6210\u529F\u7684\u8DEF\uFF0C\u7E3D\u662F\u5728\u65BD\u5DE5\u4E2D",
                                    "\u947D\u77F3\u6046\u4E45\u9060\uFF0C\u4E00\u9846\u6C38\u7559\u50B3",
                                    "\u95DC\u5FC3\u81EA\u5DF1\uFF0C\u4E5F\u95DC\u5FC3\u5225\u4EBA",
                                    "\u95DC\u6A5F\u662F\u4E00\u7A2E\u7F8E\u5FB7",
                                    "\u966A\u59B3Shopping \u4E00\u8F29\u5B50",
                                    "\u96C5\u82B3\u6BD4\u5973\u4EBA\u66F4\u77AD\u89E3\u5973\u4EBA",
                                    "\u9752\u83DC\u5E95\u5477\u5566",
                                    "\u975C\u5F97\u8B93\u60A8\u8033\u6839\u6E05\u975C",
                                    "\u99AC\u4E0A\u5C31\u6703\u597D");
                        });

        public Object bsWords =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "\u5BE6\u73FE",
                                                    "\u5BE6\u4F5C",
                                                    "\u6574\u5408",
                                                    "\u6700\u4F73\u5316",
                                                    "\u9769\u547D",
                                                    "\u8F49\u8B8A",
                                                    "\u63D0\u6607",
                                                    "\u555F\u7528",
                                                    "\u6307\u63EE",
                                                    "\u5229\u7528",
                                                    "\u91CD\u73FE",
                                                    "\u7D50\u5408",
                                                    "\u67B6\u69CB",
                                                    "\u52A0\u5F37",
                                                    "\u96C6\u4E2D",
                                                    "\u8B8A\u5F62",
                                                    "\u5F37\u5316",
                                                    "\u63A8\u5EE3",
                                                    "\u5EF6\u4F38",
                                                    "\u751F\u7522",
                                                    "\u9032\u5316",
                                                    "\u6539\u5584",
                                                    "\u63D0\u9AD8",
                                                    "\u958B\u767C",
                                                    "\u5275\u9020",
                                                    "\u5C08\u6CE8");
                                        })),
                        new ZPair(
                                1,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "\u52A0\u503C",
                                                    "\u7E31\u5411",
                                                    "\u5805\u56FA",
                                                    "\u5168\u7403",
                                                    "\u5728\u5730",
                                                    "\u9818\u5148",
                                                    "\u865B\u64EC",
                                                    "\u52D5\u614B",
                                                    "\u5B8C\u5168",
                                                    "\u6210\u719F",
                                                    "\u7A69\u5B9A",
                                                    "\u7A69\u5065",
                                                    "\u5373\u6642",
                                                    "\u5168\u5E74\u7121\u4F11",
                                                    "\u9AD8\u6548",
                                                    "\u5FEB\u901F",
                                                    "\u4E92\u52D5",
                                                    "\u4E16\u754C\u7D1A",
                                                    "\u4E0B\u4E00\u4EE3",
                                                    "\u65B0\u4E00\u4EE3",
                                                    "\u7121\u7DDA",
                                                    "\u7121\u9650",
                                                    "\u8C50\u5BCC",
                                                    "\u958B\u6E90",
                                                    "\u524D\u7AEF",
                                                    "\u5206\u6563\u5F0F",
                                                    "\u7121\u7E2B",
                                                    "\u8DE8\u5E73\u81FA");
                                        })),
                        new ZPair(
                                2,
                                ZVal.arrayFromList(
                                        "\u5178\u7BC4",
                                        "\u5E02\u5834",
                                        "\u5408\u4F5C",
                                        "\u67B6\u69CB",
                                        "\u57FA\u790E\u5E73\u81FA",
                                        "\u983B\u9053",
                                        "\u7126\u9EDE",
                                        "\u65B9\u6848",
                                        "\u89E3\u6C7A\u65B9\u6848",
                                        "\u793E\u7FA4",
                                        "\u79D1\u6280",
                                        "\u6280\u8853",
                                        "\u5167\u5BB9",
                                        "\u5165\u53E3",
                                        "\u4F9B\u61C9\u934A",
                                        "\u4ECB\u9762",
                                        "\u7CFB\u7D71",
                                        "\u983B\u5BEC",
                                        "\u6A21\u578B",
                                        "\u7DB2\u8DEF",
                                        "\u4F7F\u7528\u7D93\u9A57",
                                        "\u8A55\u91CF",
                                        "\u65B9\u6CD5")));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_TW\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "bsWords",
                            "catchPhrase",
                            "companyEnFormats",
                            "companyEnSuffix",
                            "companyModifier",
                            "companyPrefix",
                            "companySuffix",
                            "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_TW/Company.php")
                    .addExtendsClass("Faker\\Provider\\Company")
                    .addExtendsClass("Faker\\Provider\\Base")
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
