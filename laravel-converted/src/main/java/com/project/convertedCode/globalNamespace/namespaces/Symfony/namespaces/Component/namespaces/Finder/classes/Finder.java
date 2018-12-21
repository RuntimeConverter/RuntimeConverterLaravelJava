package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Comparator.classes.DateComparator;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.FileTypeFilterIterator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.SortableIterator;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Comparator.classes.NumberComparator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.DateRangeFilterIterator;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.PathFilterIterator;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.SizeRangeFilterIterator;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.FilenameFilterIterator;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.FilecontentFilterIterator;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.CustomFilterIterator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.ExcludeDirectoryFilterIterator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileInfo;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.DepthRangeFilterIterator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.AppendIterator;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Finder.php

*/

public class Finder extends RuntimeClassBase implements IteratorAggregate, Countable {

    public Object mode = 0;

    public Object names = ZVal.newArray();

    public Object notNames = ZVal.newArray();

    public Object exclude = ZVal.newArray();

    public Object filters = ZVal.newArray();

    public Object depths = ZVal.newArray();

    public Object sizes = ZVal.newArray();

    public Object followLinks = false;

    public Object sort = false;

    public Object ignore = 0;

    public Object dirs = ZVal.newArray();

    public Object dates = ZVal.newArray();

    public Object iterators = ZVal.newArray();

    public Object contains = ZVal.newArray();

    public Object notContains = ZVal.newArray();

    public Object paths = ZVal.newArray();

    public Object notPaths = ZVal.newArray();

    public Object ignoreUnreadableDirs = false;

    public Finder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Finder.class) {
            this.__construct(env, args);
        }
    }

    public Finder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.ignore =
                ZVal.toLong(
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "IGNORE_VCS_FILES"))
                        | ZVal.toLong(
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "IGNORE_DOT_FILES"));
        return null;
    }

    @ConvertedMethod
    public Object directories(RuntimeEnv env, Object... args) {
        this.mode = FileTypeFilterIterator.CONST_ONLY_DIRECTORIES;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object files(RuntimeEnv env, Object... args) {
        this.mode = FileTypeFilterIterator.CONST_ONLY_FILES;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object depth(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "depths", env)
                .arrayAppend(env)
                .set(new NumberComparator(env, level));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object date(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "dates", env)
                .arrayAppend(env)
                .set(new DateComparator(env, date));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object name(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "names", env).arrayAppend(env).set(pattern);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object notName(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "notNames", env).arrayAppend(env).set(pattern);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object contains(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "contains", env).arrayAppend(env).set(pattern);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object notContains(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "notContains", env).arrayAppend(env).set(pattern);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object path(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "paths", env).arrayAppend(env).set(pattern);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object notPath(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "notPaths", env).arrayAppend(env).set(pattern);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "size")
    public Object size(RuntimeEnv env, Object... args) {
        Object size = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "sizes", env)
                .arrayAppend(env)
                .set(new NumberComparator(env, size));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirs")
    public Object exclude(RuntimeEnv env, Object... args) {
        Object dirs = assignParameter(args, 0, false);
        this.exclude =
                function_array_merge.f.env(env).call(this.exclude, rToArrayCast(dirs)).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ignoreDotFiles")
    public Object ignoreDotFiles(RuntimeEnv env, Object... args) {
        Object ignoreDotFiles = assignParameter(args, 0, false);
        if (ZVal.isTrue(ignoreDotFiles)) {
            this.ignore =
                    ZAssignment.or(
                            "|=",
                            this.ignore,
                            ClassConstantUtils.getConstantValueLateStatic(
                                    env, this, "IGNORE_DOT_FILES"));

        } else {
            this.ignore =
                    ZAssignment.and(
                            "&=",
                            this.ignore,
                            ~ZVal.toLong(
                                    ClassConstantUtils.getConstantValueLateStatic(
                                            env, this, "IGNORE_DOT_FILES")));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ignoreVCS")
    public Object ignoreVCS(RuntimeEnv env, Object... args) {
        Object ignoreVCS = assignParameter(args, 0, false);
        if (ZVal.isTrue(ignoreVCS)) {
            this.ignore =
                    ZAssignment.or(
                            "|=",
                            this.ignore,
                            ClassConstantUtils.getConstantValueLateStatic(
                                    env, this, "IGNORE_VCS_FILES"));

        } else {
            this.ignore =
                    ZAssignment.and(
                            "&=",
                            this.ignore,
                            ~ZVal.toLong(
                                    ClassConstantUtils.getConstantValueLateStatic(
                                            env, this, "IGNORE_VCS_FILES")));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "closure", typeHint = "Closure")
    public Object sort(RuntimeEnv env, Object... args) {
        Object closure = assignParameter(args, 0, false);
        this.sort = closure;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object sortByName(RuntimeEnv env, Object... args) {
        this.sort = SortableIterator.CONST_SORT_BY_NAME;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object sortByType(RuntimeEnv env, Object... args) {
        this.sort = SortableIterator.CONST_SORT_BY_TYPE;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object sortByAccessedTime(RuntimeEnv env, Object... args) {
        this.sort = SortableIterator.CONST_SORT_BY_ACCESSED_TIME;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object sortByChangedTime(RuntimeEnv env, Object... args) {
        this.sort = SortableIterator.CONST_SORT_BY_CHANGED_TIME;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object sortByModifiedTime(RuntimeEnv env, Object... args) {
        this.sort = SortableIterator.CONST_SORT_BY_MODIFIED_TIME;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "closure", typeHint = "Closure")
    public Object filter(RuntimeEnv env, Object... args) {
        Object closure = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "filters", env).arrayAppend(env).set(closure);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object followLinks(RuntimeEnv env, Object... args) {
        this.followLinks = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "ignore",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object ignoreUnreadableDirs(RuntimeEnv env, Object... args) {
        Object ignore = assignParameter(args, 0, true);
        if (null == ignore) {
            ignore = true;
        }
        this.ignoreUnreadableDirs = ZVal.toBool(ignore);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirs")
    public Object in(RuntimeEnv env, Object... args) {
        Object dirs = assignParameter(args, 0, false);
        ReferenceContainer resolvedDirs = new BasicReferenceContainer(null);
        Object glob = null;
        Object dir = null;
        resolvedDirs.setObject(ZVal.newArray());
        for (ZPair zpairResult1826 : ZVal.getIterable(rToArrayCast(dirs), env, true)) {
            dir = ZVal.assign(zpairResult1826.getValue());
            if (function_is_dir.f.env(env).call(dir).getBool()) {
                resolvedDirs.arrayAppend(env).set(this.normalizeDir(env, dir));

            } else if (ZVal.isTrue(
                    glob =
                            NamespaceGlobal.glob
                                    .env(env)
                                    .call(
                                            dir,
                                            ZVal.toLong(
                                                            function_defined
                                                                            .f
                                                                            .env(env)
                                                                            .call("GLOB_BRACE")
                                                                            .getBool()
                                                                    ? 1024
                                                                    : 0)
                                                    | ZVal.toLong(8192))
                                    .value())) {
                resolvedDirs.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        resolvedDirs.getObject(),
                                        function_array_map
                                                .f
                                                .env(env)
                                                .call(
                                                        ZVal.newArray(
                                                                new ZPair(0, this),
                                                                new ZPair(1, "normalizeDir")),
                                                        glob)
                                                .value())
                                .value());

            } else {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("The \"%s\" directory does not exist.", dir)
                                        .value()));
            }
        }

        this.dirs =
                function_array_merge.f.env(env).call(this.dirs, resolvedDirs.getObject()).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        Object iterator = null;
        Object it = null;
        Object dir = null;
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                0, "===", function_count.f.env(env).call(this.dirs).value()))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                0,
                                "===",
                                function_count.f.env(env).call(this.iterators).value()))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "You must call one of in() or append() methods before iterating over a Finder."));
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                1, "===", function_count.f.env(env).call(this.dirs).value()))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                0,
                                "===",
                                function_count.f.env(env).call(this.iterators).value()))) {
            return ZVal.assign(
                    this.searchInDirectory(
                            env, new ReferenceClassProperty(this, "dirs", env).arrayGet(env, 0)));
        }

        iterator = new AppendIterator(env);
        for (ZPair zpairResult1827 : ZVal.getIterable(this.dirs, env, true)) {
            dir = ZVal.assign(zpairResult1827.getValue());
            env.callMethod(iterator, "append", Finder.class, this.searchInDirectory(env, dir));
        }

        for (ZPair zpairResult1828 : ZVal.getIterable(this.iterators, env, true)) {
            it = ZVal.assign(zpairResult1828.getValue());
            env.callMethod(iterator, "append", Finder.class, it);
        }

        return ZVal.assign(iterator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator")
    public Object append(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object file = null;
        Object it = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(iterator, IteratorAggregate.class, "IteratorAggregate"))) {
            new ReferenceClassProperty(this, "iterators", env)
                    .arrayAppend(env)
                    .set(env.callMethod(iterator, "getIterator", Finder.class));

        } else if (ZVal.isTrue(ZVal.checkInstanceType(iterator, Iterator.class, "Iterator"))) {
            new ReferenceClassProperty(this, "iterators", env).arrayAppend(env).set(iterator);

        } else if (ZVal.toBool(ZVal.checkInstanceType(iterator, Traversable.class, "Traversable"))
                || ZVal.toBool(function_is_array.f.env(env).call(iterator).value())) {
            it = new ArrayIterator(env);
            for (ZPair zpairResult1829 : ZVal.getIterable(iterator, env, true)) {
                file = ZVal.assign(zpairResult1829.getValue());
                env.callMethod(
                        it,
                        "append",
                        Finder.class,
                        ZVal.isTrue(ZVal.checkInstanceType(file, SplFileInfo.class, "SplFileInfo"))
                                ? file
                                : new SplFileInfo(env, file));
            }

            new ReferenceClassProperty(this, "iterators", env).arrayAppend(env).set(it);

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Finder::append() method wrong argument type."));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object hasResults(RuntimeEnv env, Object... args) {
        Object _underscoreIdentifier = null;
        for (ZPair zpairResult1830 : ZVal.getIterable(this.getIterator(env), env, true)) {
            _underscoreIdentifier = ZVal.assign(zpairResult1830.getValue());
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.iterator_count.env(env).call(this.getIterator(env)).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dir", typeHint = "string")
    private Object searchInDirectory(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object dir = assignParameter(args, 0, false);
        Object minDepth = null;
        Object maxDepth = null;
        Object comparator = null;
        Object iterator = null;
        Object flags = null;
        Object iteratorAggregate = null;
        if (ZVal.strictEqualityCheck(
                ClassConstantUtils.getConstantValueLateStatic(env, this, "IGNORE_VCS_FILES"),
                "===",
                ZVal.toLong(
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "IGNORE_VCS_FILES"))
                        & ZVal.toLong(this.ignore))) {
            this.exclude =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    this.exclude,
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .Finder
                                                            .classes
                                                            .Finder
                                                            .RequestStaticProperties
                                                            .class)
                                            .vcsPatterns)
                            .value();
        }

        if (ZVal.strictEqualityCheck(
                ClassConstantUtils.getConstantValueLateStatic(env, this, "IGNORE_DOT_FILES"),
                "===",
                ZVal.toLong(
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "IGNORE_DOT_FILES"))
                        & ZVal.toLong(this.ignore))) {
            new ReferenceClassProperty(this, "notPaths", env)
                    .arrayAppend(env)
                    .set("#(^|/)\\..+(/|$)#");
        }

        minDepth = 0;
        maxDepth = 9223372036854775807L;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1831 : ZVal.getIterable(this.depths, env, true)) {
            comparator = ZVal.assign(zpairResult1831.getValue());
            SwitchEnumType117 switchVariable117 =
                    ZVal.getEnum(
                            env.callMethod(comparator, "getOperator", Finder.class),
                            SwitchEnumType117.DEFAULT_CASE,
                            SwitchEnumType117.RESERVED_CHARS_139322586_STRING__,
                            ">",
                            SwitchEnumType117.RESERVED_CHARS_1399704895_STRING___,
                            ">=",
                            SwitchEnumType117.RESERVED_CHARS_798051478_STRING__,
                            "<",
                            SwitchEnumType117.RESERVED_CHARS_785002809_STRING___,
                            "<=");
            switch (switchVariable117) {
                case RESERVED_CHARS_139322586_STRING__:
                    minDepth = ZVal.add(env.callMethod(comparator, "getTarget", Finder.class), 1);
                    break;
                case RESERVED_CHARS_1399704895_STRING___:
                    minDepth = env.callMethod(comparator, "getTarget", Finder.class);
                    break;
                case RESERVED_CHARS_798051478_STRING__:
                    maxDepth =
                            ZVal.subtract(env.callMethod(comparator, "getTarget", Finder.class), 1);
                    break;
                case RESERVED_CHARS_785002809_STRING___:
                    maxDepth = env.callMethod(comparator, "getTarget", Finder.class);
                    break;
                case DEFAULT_CASE:
                    minDepth =
                            ZVal.assign(
                                    maxDepth =
                                            env.callMethod(comparator, "getTarget", Finder.class));
            }
            ;
        }

        flags = ZVal.assign(4096);
        if (ZVal.isTrue(this.followLinks)) {
            flags = ZAssignment.or("|=", flags, 512);
        }

        iterator =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Symfony
                        .namespaces
                        .Component
                        .namespaces
                        .Finder
                        .namespaces
                        .Iterator
                        .classes
                        .RecursiveDirectoryIterator(env, dir, flags, this.ignoreUnreadableDirs);
        if (ZVal.isTrue(this.exclude)) {
            iterator = new ExcludeDirectoryFilterIterator(env, iterator, this.exclude);
        }

        iterator = new RecursiveIteratorIterator(env, iterator, 1);
        if (ZVal.toBool(ZVal.isGreaterThan(minDepth, '>', 0))
                || ZVal.toBool(ZVal.isLessThan(maxDepth, '<', 9223372036854775807L))) {
            iterator = new DepthRangeFilterIterator(env, iterator, minDepth, maxDepth);
        }

        if (ZVal.isTrue(this.mode)) {
            iterator = new FileTypeFilterIterator(env, iterator, this.mode);
        }

        if (ZVal.toBool(this.names) || ZVal.toBool(this.notNames)) {
            iterator = new FilenameFilterIterator(env, iterator, this.names, this.notNames);
        }

        if (ZVal.toBool(this.contains) || ZVal.toBool(this.notContains)) {
            iterator =
                    new FilecontentFilterIterator(env, iterator, this.contains, this.notContains);
        }

        if (ZVal.isTrue(this.sizes)) {
            iterator = new SizeRangeFilterIterator(env, iterator, this.sizes);
        }

        if (ZVal.isTrue(this.dates)) {
            iterator = new DateRangeFilterIterator(env, iterator, this.dates);
        }

        if (ZVal.isTrue(this.filters)) {
            iterator = new CustomFilterIterator(env, iterator, this.filters);
        }

        if (ZVal.toBool(this.paths) || ZVal.toBool(this.notPaths)) {
            iterator = new PathFilterIterator(env, iterator, this.paths, this.notPaths);
        }

        if (ZVal.isTrue(this.sort)) {
            iteratorAggregate = new SortableIterator(env, iterator, this.sort);
            iterator = env.callMethod(iteratorAggregate, "getIterator", Finder.class);
        }

        return ZVal.assign(iterator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dir")
    private Object normalizeDir(RuntimeEnv env, Object... args) {
        Object dir = assignParameter(args, 0, false);
        return ZVal.assign(function_rtrim.f.env(env).call(dir, "/" + toStringR("/", env)).value());
    }

    public static final Object CONST_IGNORE_VCS_FILES = 1;

    public static final Object CONST_IGNORE_DOT_FILES = 2;

    public static final Object CONST_class = "Symfony\\Component\\Finder\\Finder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object create(RuntimeEnv env, Object... args) {
            return ZVal.assign(env.createNewWithLateStaticBindings(this));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pattern")
        public Object addVCSPattern(RuntimeEnv env, Object... args) {
            Object pattern = assignParameter(args, 0, false);
            Object p = null;
            for (ZPair zpairResult1825 : ZVal.getIterable(rToArrayCast(pattern), env, true)) {
                p = ZVal.assign(zpairResult1825.getValue());
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Finder
                                        .classes
                                        .Finder
                                        .RequestStaticProperties
                                        .class,
                                "vcsPatterns")
                        .arrayAppend(env)
                        .set(p);
            }

            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Finder
                                            .classes
                                            .Finder
                                            .RequestStaticProperties
                                            .class)
                            .vcsPatterns =
                    function_array_unique
                            .f
                            .env(env)
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .Finder
                                                            .classes
                                                            .Finder
                                                            .RequestStaticProperties
                                                            .class)
                                            .vcsPatterns)
                            .value();
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object vcsPatterns =
                ZVal.arrayFromList(
                        ".svn",
                        "_svn",
                        "CVS",
                        "_darcs",
                        ".arch-params",
                        ".monotone",
                        ".bzr",
                        ".git",
                        ".hg");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\Finder")
                    .setLookup(
                            Finder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "contains",
                            "dates",
                            "depths",
                            "dirs",
                            "exclude",
                            "filters",
                            "followLinks",
                            "ignore",
                            "ignoreUnreadableDirs",
                            "iterators",
                            "mode",
                            "names",
                            "notContains",
                            "notNames",
                            "notPaths",
                            "paths",
                            "sizes",
                            "sort")
                    .setStaticPropertyNames("vcsPatterns")
                    .setFilename("vendor/symfony/finder/Finder.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
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

    private enum SwitchEnumType117 {
        RESERVED_CHARS_139322586_STRING__,
        RESERVED_CHARS_1399704895_STRING___,
        RESERVED_CHARS_798051478_STRING__,
        RESERVED_CHARS_785002809_STRING___,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
