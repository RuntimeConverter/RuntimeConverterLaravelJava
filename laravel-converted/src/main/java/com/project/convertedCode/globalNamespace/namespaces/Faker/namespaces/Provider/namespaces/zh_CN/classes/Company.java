package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_CN.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Company.php

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
                                                                .zh_CN
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
                                                        .zh_CN
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .catchPhrase)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\zh_CN\\Company";

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
                                                            .zh_CN
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object companySuffix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    toStringR(
                                    com.project.convertedCode.globalNamespace.namespaces.Faker
                                            .namespaces.Provider.classes.Company.runtimeStaticObject
                                            .companySuffix(env),
                                    env)
                            + "\u6709\u9650\u516C\u53F8");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats = ZVal.arrayFromList("{{companyPrefix}}{{companySuffix}}");

        public Object companyPrefix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u8D85\u827A",
                                    "\u548C\u6CF0",
                                    "\u4E5D\u65B9",
                                    "\u946B\u535A\u817E\u98DE",
                                    "\u6234\u7855\u7535\u5B50",
                                    "\u6D4E\u5357\u4EBF\u6B21\u5143",
                                    "\u6D77\u521B",
                                    "\u521B\u8054\u4E16\u7EAA",
                                    "\u51CC\u4E91",
                                    "\u6CF0\u9E92\u9E9F",
                                    "\u5F69\u8679",
                                    "\u5170\u91D1\u7535\u5B50",
                                    "\u6656\u6765\u8BA1\u7B97\u673A",
                                    "\u5929\u76CA",
                                    "\u6052\u806A\u767E\u6C47",
                                    "\u83CA\u98CE\u516C\u53F8",
                                    "\u60E0\u6D3E\u56FD\u9645\u516C\u53F8",
                                    "\u521B\u6C47",
                                    "\u601D\u4F18",
                                    "\u65F6\u7A7A\u76D2\u6570\u5B57",
                                    "\u6613\u52A8\u529B",
                                    "\u98DE\u6D77\u79D1\u6280",
                                    "\u534E\u6CF0\u901A\u5B89",
                                    "\u76DF\u65B0",
                                    "\u5546\u8F6F\u51A0\u8054",
                                    "\u56FE\u9F99\u4FE1\u606F",
                                    "\u6613\u52A8\u529B",
                                    "\u534E\u8FDC\u8F6F\u4EF6",
                                    "\u521B\u4EBF",
                                    "\u65F6\u523B",
                                    "\u5F00\u53D1\u533A\u4E16\u521B",
                                    "\u660E\u817E",
                                    "\u826F\u8BFA",
                                    "\u5929\u5F00",
                                    "\u6BD5\u535A\u8BDA",
                                    "\u5FEB\u8BAF",
                                    "\u51CC\u9896\u4FE1\u606F",
                                    "\u9EC4\u77F3\u91D1\u627F",
                                    "\u6069\u608C",
                                    "\u96E8\u6797\u6728\u98CE\u8BA1\u7B97\u673A",
                                    "\u53CC\u654F\u7535\u5B50",
                                    "\u7EF4\u65FA\u660E",
                                    "\u7F51\u65B0\u6052\u5929",
                                    "\u6570\u5B57100",
                                    "\u98DE\u5229\u4FE1",
                                    "\u7ACB\u4FE1\u7535\u5B50",
                                    "\u8054\u901A\u65F6\u79D1",
                                    "\u4E2D\u5EFA\u521B\u4E1A",
                                    "\u65B0\u683C\u6797\u8010\u7279",
                                    "\u65B0\u5B87\u9F99\u4FE1\u606F",
                                    "\u6D59\u5927\u4E07\u670B",
                                    "MBP\u8F6F\u4EF6",
                                    "\u6602\u6B4C\u4FE1\u606F",
                                    "\u4E07\u8FC5\u7535\u8111",
                                    "\u65B9\u6B63\u79D1\u6280",
                                    "\u8054\u8F6F",
                                    "\u4E03\u559C",
                                    "\u5357\u5EB7",
                                    "\u94F6\u5609",
                                    "\u5DE8\u5965",
                                    "\u4F73\u79BE",
                                    "\u56FD\u8BAF",
                                    "\u4FE1\u8BDA\u81F4\u8FDC",
                                    "\u6D66\u534E\u4F17\u57CE",
                                    "\u8FEA\u6469",
                                    "\u592A\u6781",
                                    "\u7FA4\u82F1",
                                    "\u5408\u8054\u7535\u5B50",
                                    "\u540C\u5174\u4E07\u70B9",
                                    "\u8944\u6A0A\u5730\u7403\u6751",
                                    "\u7CBE\u82AF",
                                    "\u827E\u63D0\u79D1\u4FE1",
                                    "\u660A\u5609",
                                    "\u9E3F\u777F\u601D\u535A",
                                    "\u56DB\u901A",
                                    "\u5BCC\u7F73",
                                    "\u5546\u8F6F\u51A0\u8054",
                                    "\u8BFA\u4F9D\u66FC\u8F6F\u4EF6",
                                    "\u4E1C\u65B9\u5CFB\u666F",
                                    "\u534E\u6210\u80B2\u5353",
                                    "\u8D8B\u52BF",
                                    "\u7EF4\u6D9B",
                                    "\u901A\u9645\u540D\u8054");
                        });

        public Object companySuffix =
                ZVal.arrayFromList("\u79D1\u6280", "\u7F51\u7EDC", "\u4FE1\u606F", "\u4F20\u5A92");

        public Object catchPhrase =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u71D5\u821E\uFF0C\u71D5\u821E\uFF0C\u4E00\u66F2\u6B4C\u6765\u4E00\u7247\u60C5\u3002",
                                    "\u5EB7\u5E08\u5085\u65B9\u4FBF\u9762\uFF0C\u597D\u5403\u770B\u5F97\u89C1\u3002",
                                    "\u4E0D\u8981\u592A\u6F47\u6D12\uFF01",
                                    "\u8BA9\u4E00\u4EBF\u4EBA\u5148\u806A\u660E\u8D77\u6765\u3002",
                                    "\u5171\u521B\u7F8E\u7684\u524D\u7A0B\uFF0C\u5171\u5EA6\u7F8E\u7684\u4EBA\u751F\u3002",
                                    "\u7701\u4F18\uFF0C\u90E8\u4F18\uFF0C\u845B\u4F18\uFF1F",
                                    "\u559D\u5B54\u5E9C\u5BB4\u9152\uFF0C\u505A\u5929\u4E0B\u6587\u7AE0\u3002",
                                    "\u5065\u5EB7\u6210\u5C31\u672A\u6765\u3002",
                                    "\u7259\u597D\uFF0C\u80C3\u53E3\u5C31\u597D\uFF0C\u8EAB\u4F53\u500D\u513F\u68D2\uFF0C\u5403\u561B\u561B\u9999\u3002",
                                    "\u6C38\u8FDC\u7684\u7EFF\u8272\uFF0C\u6C38\u8FDC\u7684\u79E6\u6C60\u3002",
                                    "\u5750\u7EA2\u65D7\u8F66\uFF0C\u8D70\u4E2D\u56FD\u8DEF\u3002",
                                    "\u8981\u60F3\u76AE\u80A4\u597D\uFF0C\u65E9\u665A\u7528\u5927\u5B9D\u3002",
                                    "\u5B54\u5E9C\u5BB6\u9152\uFF0C\u53EB\u4EBA\u60F3\u5BB6\u3002",
                                    "\u8865\u9499\u65B0\u89C2\u5FF5\uFF0C\u5438\u6536\u662F\u8981\u5BB3\u3002",
                                    "\u559D\u6C47\u6E90\u679C\u6C41\uFF0C\u8D70\u5065\u5EB7\u4E4B\u8DEF\u3002",
                                    "\u7231\u7684\u5C31\u662F\u4F60!",
                                    "\u4E00\u79CD\u53EF\u4EE5\u4E16\u88AD\u7684\u53E4\u5178\u6D6A\u6F2B",
                                    "\u5B9E\u529B\u521B\u9020\u4EF7\u503C",
                                    "\u7231\u751F\u6D3B\uFF0C\u7231\u62C9\u82B3\uFF01",
                                    "\u4EBA\u7C7B\u5931\u53BB\u8054\u60F3\uFF0C\u4E16\u754C\u5C06\u4F1A\u600E\u6837\uFF1F",
                                    "\u505A\u5973\u4EBA\u633A\u597D\uFF01",
                                    "\u4E16\u754C\u5728\u4F60\u773C\u4E2D\uFF1F",
                                    "\u4ECA\u5929\u4F60\u6709\u5426\u4EBF\u5510\uFF1F",
                                    "\u53EA\u6EB6\u5728\u53E3\uFF0C\u4E0D\u6EB6\u5728\u624B\u3002",
                                    "\u4E09\u5343\u70E6\u607C\u4E1D\uFF0C\u5065\u5EB7\u65B0\u5F00\u59CB\u3002",
                                    "\u7EF4\u7EF4\u8C46\u5976\uFF0C\u6B22\u4E50\u5F00\u6000\u3002",
                                    "\u6211\u4EEC\u7684\u5149\u5F69\u6765\u81EA\u4F60\u7684\u98CE\u91C7\u3002",
                                    "\u94BB\u77F3\u6052\u4E45\u8FDC\uFF0C\u4E00\u9897\u6C38\u6D41\u4F20\u3002",
                                    "\u653E\u6211\u7684\u771F\u5FC3\u5728\u4F60\u7684\u624B\u5FC3\u3002",
                                    "\u5C0F\u8EAB\u6750\uFF0C\u5927\u5473\u9053\u3002",
                                    "\u725B\u5976\u9999\u6D53\uFF0C\u4E1D\u822C\u611F\u53D7\u3002",
                                    "\u8046\u542C\u5E76\u4E0D\u4EE3\u8868\u6C89\u9ED8\uFF0C\u6709\u65F6\u5B89\u9759\u4E5F\u662F\u4E00\u79CD\u529B\u91CF\u3002",
                                    "\u6EF4\u6EF4\u9999\u6D53\uFF0C\u610F\u72B9\u672A\u5C3D\u3002",
                                    "\u6C34\u6676\u4E4B\u604B\uFF0C\u4E00\u751F\u4E0D\u53D8\u3002",
                                    "\u4E2D\u56FD\u79FB\u52A8\u901A\u4FE1\uFF0C\u6C9F\u901A\u4ECE\u5FC3\u5F00\u59CB\uFF01",
                                    "\u7F51\u6613\uFF0C\u7F51\u805A\u4EBA\u7684\u529B\u91CF\uFF01",
                                    "\u79D1\u6280\u4EE5\u4EBA\u4E3A\u672C\uFF0C\u8BFA\u57FA\u4E9A",
                                    "\u6211\u4EEC\u4E00\u76F4\u5728\u52AA\u529B\uFF01",
                                    "\u9633\u5149\u603B\u5728\u98CE\u96E8\u540E",
                                    "\u7537\u4EBA\u5BF9\u897F\u670D\u7684\u8981\u6C42\uFF0C\u5C31\u662F\u5973\u4EBA\u5BF9\u7537\u4EBA\u7684\u8981\u6C42",
                                    "\u665A\u62A5\uFF0C\u4E0D\u665A\u62A5",
                                    "\u539F\u6765\u751F\u6D3B\u53EF\u4EE5\u66F4\u7F8E\u7684",
                                    "\u660E\u5929\u7684\u660E\u5929\uFF0C\u4F60\u8FD8\u4F1A\u9001\u6211\u201C\u6C34\u6676\u4E4B\u604B\u201D\u5417\uFF1F",
                                    "\u536B\u6D74\u51FA\u51FA\u8FDB\u8FDB\u7684\u5FEB\u611F",
                                    "\u6709\u5BB6\u5C31\u6709\u8054\u5408\u5229\u534E",
                                    "\u51CF\u8102\u51CF\u80A5\uFF0C\u5176\u5B9E\u662F\u4E00\u79CD\u751F\u6D3B\u6001\u5EA6",
                                    "\u4EBA\u5934\u9A6C\u4E00\u5F00\uFF0C\u597D\u4E8B\u81EA\u7136\u6765\u3002",
                                    "\u5047\u5982\u4E94\u6307\u4E00\u6837\u957F\uFF0C\u600E\u80FD\u6EE1\u8DB3\u7528\u6237\u4E0D\u540C\u9700\u6C42\uFF1F",
                                    "\u65B0\u98DE\u5E7F\u544A\u505A\u7684\u597D\uFF0C\u4E0D\u597D\u65B0\u98DE\u51B0\u7BB1\u597D",
                                    "\u4F20\u5947\u54C1\u8D28\uFF0C\u767E\u5E74\u5F20\u88D5",
                                    "\u674E\u5B81\uFF1A\u628A\u51FA\u8272\u7559\u7ED9\u81EA\u5DF1",
                                    "\u4E00\u65E6\u62E5\u6709\uFF0C\u522B\u65E0\u9009\u62E9",
                                    "\u79D1\u6280\u8BA9\u4F60\u66F4\u8F7B\u677E",
                                    "\u60C5\u7CFB\u4E2D\u56FD\u7ED3\uFF0C\u8054\u901A\u56DB\u6D77\u5FC3",
                                    "\u6D77\u5C14\uFF0C\u4E2D\u56FD\u9020",
                                    "SOHU\uFF1A\u8DB3\u8FF9\u751F\u6D3B\u6BCF\u4E00\u5929",
                                    "\u679C\u51BB\u6211\u8981\u559C\u4E4B\u90CE",
                                    "\u56FD\u5B9D\u5927\u718A\u732B\uFF0C\u5FC3\u7EAF\u5929\u81EA\u9AD8",
                                    "\u4E16\u754C\u56E0\u4E3A\u4E0D\u540C",
                                    "\u653E\u4F4E\u504F\u89C1\uFF0C\u4F60\u4F1A\u6709\u51FA\u8272\u53D1\u73B0\uFF01",
                                    "Just",
                                    "\u521B\u610F\u4F3C\u91D1\uFF0C\u656C\u4E1A\u5982\u725B",
                                    "\u4E0D\u8981\u8BA9\u7537\u4EBA\u4E00\u624B\u628A\u63E1",
                                    "\u5982\u540C\u60C5\u4EBA\u7684\u624B",
                                    "\u91D1\u7A9D\u94F6\u7A9D\uFF0C\u4E0D\u5982\u81EA\u5DF1\u7684\u5B89\u4E50\u7A9D\u3002",
                                    "\u6CA1\u6709\u4EC0\u4E48\u5927\u4E0D\u4E86\u7684",
                                    "\u65F6\u95F4\u56E0\u6211\u5B58\u5728",
                                    "\u53EA\u8981\u6709\u68A6\u60F3",
                                    "\u5357\u65B9\u5468\u672B",
                                    "\u65F6\u95F4\u6539\u53D8\u4E00\u5207",
                                    "\u5730\u7403\u4EBA\u90FD\u77E5\u9053\u4E86",
                                    "\u4F17\u91CC\u5BFB\u4ED6\u5343\u767E\u5EA6\uFF0C\u60F3\u8981\u51E0\u5EA6\u5C31\u51E0\u5EA6",
                                    "\u60A8\u8EAB\u8FB9\u7684\u94F6\u884C\uFF0C\u53EF\u4FE1\u8D56\u7684\u94F6\u884C",
                                    "\u4E09\u53F6\u94A2\u7434\uFF1A\u5B66\u7434\u7684\u5B69\u5B50\u4E0D\u4F1A\u53D8\u574F",
                                    "\u67EF\u8FBE\uFF1A\u4E32\u8D77\u751F\u6D3B\u6BCF\u4E00\u523B",
                                    "\u5927\u4F17\u7532\u514B\u866B\u6C7D\u8F66\uFF1A\u60F3\u60F3\u8FD8\u662F\u5C0F\u7684\u597D",
                                    "\u4E00\u76F4\u88AB\u6A21\u62DF,\u4ECE\u672A\u88AB\u8D85\u8D8A",
                                    "\u5E78\u798F\u751F\u6D3B",
                                    "\u6717\u8BAF\u7684\u521B\u9020\u529B\u79D1\u6280\u7684\u539F\u52A8\u529B",
                                    "\u4E8B\u4E8B\u56E0\u4F60\u800C\u51FA\u8272",
                                    "\u8FD0\u52A8\u4E4B\u7F8E\uFF0C\u4E16\u754C\u5171\u4EAB",
                                    "\u9E64\u821E\u767D\u6C99",
                                    "\u60F3\u77E5\u9053\u201C\u6E05\u5634\u201D\u7684\u5473\u9053\u5417\uFF1F",
                                    "\u5F39\u6307\u4E00\u6325\u95F4\uFF0C\u4E16\u754C\u7686\u4E92\u8054",
                                    "\u66F4\u591A\u9009\u62E9\u3001\u66F4\u591A\u6B22\u7B11",
                                    "\u65B9\u592A\uFF0C\u8BA9\u5BB6\u7684\u611F\u89C9\u66F4\u597D",
                                    "\u4E16\u4E0A\u4EC5\u6B64\u4E00\u4EF6\uFF0C\u4ECA\u751F\u4E0E\u4F60\u7ED3\u7F18\uFF01",
                                    "\u767D\u91CC\u900F\u7EA2\u4E0E\u4F17\u4E0D\u540C",
                                    "\u6CA1\u6709\u86C0\u7259-\u4F73\u6D01\u58EB",
                                    "\u6709\u7EBF\u7684\u4EF7\u503C",
                                    "\u4EAB\u53D7\u5FEB\u4E50\u79D1\u6280",
                                    "\u56DB\u6D77\u4E00\u5BB6\u7684\u89E3\u51B3\u4E4B\u9053",
                                    "\u5A03\u54C8\u54C8\u7EAF\u51C0\u6C34\uFF1A\u7231\u4F60\u7B49\u4E8E\u7231\u81EA\u5DF1",
                                    "\u519C\u6C11\u5C71\u6CC9\uFF1A\u6709\u70B9\u751C",
                                    "\u535A\u5927\u7CBE\u6DF1\uFF0C\u897F\u95E8\u5B50",
                                    "\u4E00\u5207\u5C3D\u5728\u628A\u63E1",
                                    "\u58F0\u58F0\u767E\u601D\u7279\uFF0C\u9065\u9065\u4E24\u76F8\u77E5",
                                    "\u4E00\u547C\u5929\u4E0B\u5E94",
                                    "\u8BA9\u6211\u4EEC\u505A\u5F97\u66F4\u597D\uFF01",
                                    "\u6696\u548C\u4EB2\u60C5\uFF0C\u91D1\u9F99\u9C7C\u7684\u5927\u5BB6\u5EAD\u3002",
                                    "\u81EA\u7136\u6700\u5065\u5EB7\uFF0C\u7EFF\u8272\u597D\u5FC3\u60C5",
                                    "\u652F\u8D77\u7F51\u7EDC\u4E16\u754C",
                                    "\u7ACB\u90A6\u6F06\uFF1A\u5904\u5904\u653E\u5149\u5F69\uFF01",
                                    "fm365:\u771F\u60C5\u4E92\u52A8\uFF01",
                                    "\u5E84\u91CD\u4E00\u751F\uFF0C\u5409\u7965\u4E00\u751F\u3002",
                                    "\u4EBA\u4EBA\u90FD\u4E3A\u793C\u54C1\u6101\uFF0C\u6211\u9001\u5317\u6781\u6D77\u72D7\u6CB9\u3002",
                                    "\u5047\u5982\u8BF4\u4EBA\u751F\u7684\u79BB\u5408\u662F\u4E00\u573A\u620F\uFF0C\u90A3\u4E48\u767E\u5E74\u7684\u597D\u5408\u66F4\u662F\u65E9\u6709\u5B89\u6392\uFF01",
                                    "\u4E00\u54C1\u9EC4\u5C71\u5929\u9AD8\u4E91\u6DE1",
                                    "\u4E0A\u4E0A\u4E0B\u4E0B\u7684\u4EAB\u53D7\uFF01",
                                    "\u6211\u662F\u3001\u6211\u884C\u3001\u6211\u7D20",
                                    "\u8BA9\u65E0\u529B\u8005\u6709\u529B\uFF0C\u8BA9\u60B2\u89C2\u8005\u524D\u884C",
                                    "\u91D1\u5229\u6765\u2014-\u7537\u4EBA\u7684\u4E16\u754C\uFF01",
                                    "\u767E\u8863\u767E\u987A",
                                    "\u806A\u660E\u4F55\u5FC5\u7EDD\u9876\uFF0C\u6167\u6839\u957F\u7559",
                                    "\u6C34\u5F80\u9AD8\u5904\u6D41",
                                    "\u5927\u77F3\u5316\u5C0F\uFF0C\u5C0F\u77F3\u5316\u4E86\uFF01",
                                    "\u201C\u95F2\u201D\u59BB\u826F\u6BCD",
                                    "\u201C\u53E3\u670D\u201D\uFF0C\u201C\u5FC3\u670D\u201D\uFF01",
                                    "\u76DB\u6EE1\u9752\u6625\u7684\u79D8\u5BC6\uFF01",
                                    "\u4E09\u5341\u516D\u8BA1\u8D70\u4E3A\u4E0A",
                                    "\u4E3A\u4E86\u5979\u7684\u8282\u65E5\uFF0C\u732E\u4E0A\u60A8\u7EAF\u91D1\u822C\u7684\u5FC3\uFF01",
                                    "\u7528\u6211\u4EEC\u7684\u9493\u7EBF\uFF0C\u4F60\u53EF\u4EE5\u5728\u9C7C\u513F\u53D1\u73B0\u4F60\u4E4B\u524D\u5148\u627E\u5230\u5B83",
                                    "\u751F\u6D3B\u5C31\u662F\u4E00\u573A\u8FD0\u52A8\uFF0C\u559D\u4E0B\u5B83\u3002",
                                    "\u9009\u62E9\u7EF4\u805A\u963F\u5C14\uFF0C\u5DF2\u7ECF\u8868\u660E\u4F60\u5FC3\u660E\u773C\u4EAE\u3002",
                                    "\u4F73\u80FD\uFF0C\u6211\u4EEC\u770B\u5F97\u89C1\u4F60\u60F3\u8868\u8FBE\u4EC0\u4E48\u3002",
                                    "\u5929\u5929\u90FD\u662F\u6625\u5929",
                                    "\u5047\u5982\u4F60\u4E0D\u6765\uFF0C\u5E7F\u544A\u660E\u661F\u5C31\u662F\u4ED6",
                                    "\u4EAB\u53D7\u9ED1\u591C\u4E2D\u5077\u62CD\u7684\u5FEB\u611F\uFF01",
                                    "\u5F69\u4FE1\u53D1\u9001\u52A8\u4EBA\u4E00\u523B",
                                    "\u7075\u611F\u70B9\u4EAE\u751F\u6D3B!",
                                    "\u806A\u660E\u6F14\u7ECE\uFF0C\u65E0\u5904\u4E0D\u5728\uFF01",
                                    "\u4E8B\u4E1A\u6211\u4E00\u5B9A\u4E89\u53D6\uFF0C\u5BF9\u4F60\u6211\u4ECE\u672A\u653E\u5F03!",
                                    "\u6CE2\u5BFC\u624B\u673A\uFF0C\u624B\u673A\u4E2D\u7684\u6218\u6597\u673A",
                                    "\u9102\u5C14\u591A\u65AF\u7F8A\u7ED2\u886B\u6696\u548C\u5168\u4E16\u754C",
                                    "\u6D01\u5A77245\u518D\u5927\u7684\u52A8\u4F5C\u4E5F\u4E0D\u8981\u7D27",
                                    "\u505A\u5149\u660E\u7684\u725B\uFF0C\u4EA7\u5149\u660E\u7684\u5976",
                                    "\u5047\u5982\u4F60\u7684\u6C7D\u8F66\u4F1A\u6E38\u6CF3\u7684\u8BDD\uFF0C\u8BF7\u7167\u76F4\u5F00\uFF0C\u4E0D\u5FC5\u5239\u8F66\u3002",
                                    "\u6C38\u8FDC\u8981\u8BA9\u9A7E\u9A76\u6267\u7167\u6BD4\u4F60\u81EA\u5DF1\u5148\u5230\u671F\u3002",
                                    "\u8BF7\u8BB0\u4F4F\uFF0C\u4E0A\u5E1D\u5E76\u4E0D\u662F\u5341\u5168\u5341\u7F8E\u7684\uFF0C\u5B83\u7ED9\u6C7D\u8F66\u9884\u5907\u4E86\u5907\u4EF6\uFF0C\u800C\u4EBA\u6CA1\u6709\u3002",
                                    "\u5C0F\u522B\u610F\u9178\u9178\uFF0C\u6B22\u805A\u5FC3\u751C\u751C\u3002",
                                    "\u9664\u949E\u7968\u5916\uFF0C\u627F\u5370\u4E00\u5207\u3002",
                                    "\u66F4\u591A\u6B22\u4E50\uFF0C\u66F4\u591A\u9009\u62E9",
                                    "\u7F8E\u7531\u4F60\u505A\u4E3B",
                                    "\u7531\u6211\u5929\u5730\u5BBD",
                                    "Sun\u662F\u592A\u9633\uFF0CJava\u662F\u6708\u4EAE\u3002",
                                    "\u4E0D\u65AD\u521B\u65B0\uFF0C\u56E0\u4E3A\u4E13\u5FC3",
                                    "\u8D81\u65E9\u4E0B\u300E\u6591\u300F\uFF0C\u8BF7\u52FF\u300E\u75D8\u300F\u7559\u3002",
                                    "\u8BF7\u4E0D\u8981\u540C\u521A\u521A\u8D70\u51FA\u672C\u9662\u7684\u5973\u4EBA\u8C03\u60C5\uFF0C\u5979\u6216\u8BB8\u5C31\u662F\u4F60\u7684\u5916\u7956\u6BCD\u3002",
                                    "\u521B\u65B0\u5C31\u662F\u751F\u6D3B",
                                    "\u6709\u4E00\u4E2A\u6F02\u4EAE\u7684\u5730\u65B9\uFF0C\u4E07\u79D1\u56DB\u5B63\u82B1\u57CE",
                                    "\u5EFA\u7B51\u65E0\u9650\u751F\u6D3B",
                                    "\u81ED\u540D\u8FDC\u626C\uFF0C\u9999\u98D8\u4E07\u91CC",
                                    "\u5C1D\u5C1D\u6B22\u7B11\uFF0C\u7ECF\u5E38\u9EA6\u5F53\u52B3",
                                    "\u6DF1\u5165\u6210\u5C31\u6DF1\u5EA6",
                                    "\u51FA\u8272\u6E56\u5357\uFF0C\u7EA2\u7F51\u4E86\u7136\uFF01",
                                    "\u56E0\u4E3A\u7F51\u7EDC\uFF0C\u5730\u7403\u5982\u6751\uFF01",
                                    "\u4E00\u79CD\u8D28\u611F",
                                    "\u6052\u4E45\u671F\u76FC",
                                    "\u7E41\u8363\u6C11\u65CF\u6587\u5316",
                                    "\u4E0D\u4FE1\uFF0C\u6B7B\u7ED9\u4F60\u770B\uFF01",
                                    "\u5929\u751F\u7684\uFF0C\u5F3A\u751F\u7684",
                                    "\u96EA\u6D25\u5564\u9152\uFF0C\u771F\u60C5\u7684\u5473\u9053\uFF01",
                                    "\u542C\u4E16\u754C\uFF0C\u6253\u5929\u4E0B",
                                    "\u96C5\u82B3\u6BD4\u5973\u4EBA\u66F4\u4E86\u89E3\u5973\u4EBA",
                                    "Sun\u662F\u592A\u9633\uFF0CJava\u662F\u6708\u4EAE\u3002",
                                    "\u4E2D\u56FD\u7F51\u901A",
                                    "\u65E0\u7EBF\u4F60\u7684\u65E0\u9650",
                                    "\u5BB6\u6709\u4E09\u6D0B\uFF0C\u51AC\u6696\u590F\u51C9",
                                    "\u503E\u8BC9\u51AC\u65E5\u6696\u8BED",
                                    "\u8C01\u8BA9\u6211\u5FC3\u52A8\uFF1F",
                                    "\u7075\u6D3B\uFF0C\u8BA9\u7BEE\u7403\u573A\u4E0D\u518D\u662F\u4E00\u4E2A\u5E73\u9762",
                                    "\u522B\u543B\u6211\uFF0C\u6211\u6015\u4FEE\u3002",
                                    "\u4E00\u547C\u56DB\u5E94\uFF01",
                                    "\u65E0\u6240\u4E0D\u5305\uFF01",
                                    "\u5F53\u4E4B\u65E0\u6127",
                                    "\u4EE5\u5E3D\u53D6\u4EBA\uFF01",
                                    "\u4E00\u6BDB\u4E0D\u62D4\uFF01",
                                    "\u81EA\u8BA8\u82E6\u5403\uFF01",
                                    "\u6210\u529F\u4E0E\u79D1\u6280\u5171\u8F89\u6620",
                                    "\u6CA1\u6709\u6700");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_CN\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "catchPhrase", "companyPrefix", "companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Company.php")
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
