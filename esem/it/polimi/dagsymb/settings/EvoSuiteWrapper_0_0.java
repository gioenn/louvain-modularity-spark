package it.polimi.dagsymb.settings;

import static sushi.compile.path_condition_distance.DistanceBySimilarityWithPathCondition.distance;

import static java.lang.Double.*;
import static java.lang.Math.*;

import sushi.compile.path_condition_distance.*;
import sushi.logging.Level;
import sushi.logging.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvoSuiteWrapper_0_0 {
    private static final double SMALL_DISTANCE = 1;
    private static final double BIG_DISTANCE = 1E300;

    private static final String STRING_LITERAL_0 = "";
    private static final String STRING_LITERAL_1 = "it.polimi.dagsymb.Louvain";
    private static final String STRING_LITERAL_2 = "local";
    private static final String STRING_LITERAL_3 = "valsDouble";
    private static final String STRING_LITERAL_4 = "valsLong";

    public double test0(it.polimi.dagsymb.Louvain __ROOT_this, it.polimi.dagsymb.LouvainConfig __ROOT_config) throws Exception {
        //generated for state .1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1[317]
        final ArrayList<ClauseSimilarityHandler> pathConditionHandler = new ArrayList<>();
        ValueCalculator valueCalculator;
        // pre_init(java/lang/Package)
        ;
        // pre_init(java/lang/StringCoding)
        ;
        // pre_init(sun/misc/ExtensionDependency)
        ;
        // pre_init(java/lang/invoke/MethodHandleNatives)
        ;
        // pre_init(java/lang/invoke/MemberName)
        ;
        // pre_init(java/lang/Cloneable)
        ;
        // pre_init(java/lang/invoke/MethodHandle)
        ;
        // pre_init(java/lang/IllegalArgumentException)
        ;
        // pre_init(java/lang/IllegalMonitorStateException)
        ;
        // pre_init(java/lang/StackOverflowError)
        ;
        // pre_init(java/lang/ArithmeticException)
        ;
        // pre_init(java/lang/ArrayStoreException)
        ;
        // pre_init(java/lang/ClassCastException)
        ;
        // pre_init(java/lang/NullPointerException)
        ;
        // pre_init(java/lang/RuntimeException)
        ;
        // pre_init(java/lang/Exception)
        ;
        // pre_init(java/lang/OutOfMemoryError)
        ;
        // pre_init(java/lang/VirtualMachineError)
        ;
        // pre_init(java/lang/Error)
        ;
        // pre_init(java/lang/Throwable)
        ;
        // pre_init(jbse/base/Base)
        ;
        // pre_init(java/lang/ref/Finalizer)
        ;
        // pre_init(java/lang/ref/FinalReference)
        ;
        // pre_init(java/lang/ref/Reference)
        ;
        // pre_init(java/lang/reflect/Method)
        ;
        // pre_init(java/lang/reflect/Executable)
        ;
        // pre_init(java/lang/reflect/Member)
        ;
        // pre_init(java/lang/reflect/AccessibleObject)
        ;
        // pre_init(java/lang/ClassLoader)
        ;
        // pre_init(java/lang/Class)
        ;
        // pre_init(java/lang/reflect/AnnotatedElement)
        ;
        // pre_init(java/lang/reflect/Type)
        ;
        // pre_init(java/lang/reflect/GenericDeclaration)
        ;
        // pre_init(java/lang/Thread)
        ;
        // pre_init(java/lang/Runnable)
        ;
        // pre_init(java/lang/ThreadGroup)
        ;
        // pre_init(java/lang/Thread$UncaughtExceptionHandler)
        ;
        // pre_init(java/lang/System)
        ;
        // pre_init(java/lang/String)
        ;
        // pre_init(java/lang/CharSequence)
        ;
        // pre_init(java/lang/Comparable)
        ;
        // pre_init(java/io/Serializable)
        ;
        // pre_init(java/lang/Object)
        ;
        // pre_init(java/lang/String$CaseInsensitiveComparator)
        ;
        // pre_init(java/util/Comparator)
        ;
        // pre_init(java/lang/RuntimePermission)
        ;
        // pre_init(java/security/BasicPermission)
        ;
        // pre_init(java/security/Permission)
        ;
        // pre_init(java/security/Guard)
        ;
        // pre_init(java/security/AccessController)
        ;
        // pre_init(java/security/AccessControlContext)
        ;
        // pre_init(java/util/Vector)
        ;
        // pre_init(java/util/RandomAccess)
        ;
        // pre_init(java/util/List)
        ;
        // pre_init(java/util/Collection)
        ;
        // pre_init(java/lang/Iterable)
        ;
        // pre_init(java/util/AbstractList)
        ;
        // pre_init(java/util/AbstractCollection)
        ;
        // pre_init(java/util/Stack)
        ;
        // pre_init(java/lang/reflect/ReflectPermission)
        ;
        // pre_init(sun/reflect/ReflectionFactory$GetReflectionFactoryAction)
        ;
        // pre_init(java/security/PrivilegedAction)
        ;
        // pre_init(sun/reflect/ReflectionFactory)
        ;
        // pre_init(java/lang/ref/Reference$Lock)
        ;
        // pre_init(java/lang/ref/Reference$ReferenceHandler)
        ;
        // pre_init(java/lang/InterruptedException)
        ;
        // pre_init(sun/misc/Cleaner)
        ;
        // pre_init(java/lang/ref/PhantomReference)
        ;
        // pre_init(java/lang/ref/ReferenceQueue)
        ;
        // pre_init(java/lang/ref/ReferenceQueue$Null)
        ;
        // pre_init(java/lang/ref/ReferenceQueue$Lock)
        ;
        // pre_init(java/lang/ref/Reference$1)
        ;
        // pre_init(sun/misc/JavaLangRefAccess)
        ;
        // pre_init(sun/misc/SharedSecrets)
        ;
        // pre_init(sun/misc/Unsafe)
        ;
        // pre_init(sun/reflect/Reflection)
        ;
        // pre_init(java/util/HashMap)
        ;
        // pre_init(java/util/Map)
        ;
        // pre_init(java/util/AbstractMap)
        ;
        // pre_init(java/util/HashMap$Node)
        ;
        // pre_init(java/util/Map$Entry)
        ;
        // pre_init(sun/misc/VM)
        ;
        // pre_init(java/util/Properties)
        ;
        // pre_init(java/util/Hashtable)
        ;
        // pre_init(java/util/Dictionary)
        ;
        // pre_init(java/lang/Float)
        ;
        // pre_init(java/lang/Number)
        ;
        // pre_init(java/lang/Math)
        ;
        // pre_init(java/lang/Double)
        ;
        // pre_init(java/lang/ref/Finalizer$FinalizerThread)
        ;
        // pre_init(java/util/Hashtable$Entry)
        ;
        // pre_init(java/util/Hashtable$EntrySet)
        ;
        // pre_init(java/util/AbstractSet)
        ;
        // pre_init(java/util/Set)
        ;
        // pre_init(java/util/Collections)
        ;
        // pre_init(java/util/Collections$EmptySet)
        ;
        // pre_init(java/util/Collections$EmptyList)
        ;
        // pre_init(java/util/Collections$EmptyMap)
        ;
        // pre_init(java/util/Collections$SynchronizedSet)
        ;
        // pre_init(java/util/Collections$SynchronizedCollection)
        ;
        // pre_init(java/util/Objects)
        ;
        // pre_init(java/util/Hashtable$Enumerator)
        ;
        // pre_init(java/util/Iterator)
        ;
        // pre_init(java/util/Enumeration)
        ;
        // pre_init(sun/misc/Version)
        ;
        // pre_init(java/io/FileInputStream)
        ;
        // pre_init(java/io/InputStream)
        ;
        // pre_init(java/io/Closeable)
        ;
        // pre_init(java/io/FileDescriptor)
        ;
        // pre_init(java/io/FileDescriptor$1)
        ;
        // pre_init(sun/misc/JavaIOFileDescriptorAccess)
        ;
        // pre_init(java/io/FileOutputStream)
        ;
        // pre_init(java/io/OutputStream)
        ;
        // pre_init(java/io/Flushable)
        ;
        // pre_init(java/io/BufferedInputStream)
        ;
        // pre_init(java/io/FilterInputStream)
        ;
        // pre_init(java/util/concurrent/atomic/AtomicReferenceFieldUpdater)
        ;
        // pre_init(java/util/concurrent/atomic/AtomicReferenceFieldUpdater$AtomicReferenceFieldUpdaterImpl)
        ;
        // pre_init(java/util/concurrent/atomic/AtomicReferenceFieldUpdater$AtomicReferenceFieldUpdaterImpl$1)
        ;
        // pre_init(java/security/PrivilegedExceptionAction)
        ;
        // pre_init(java/lang/Class$3)
        ;
        // pre_init(java/lang/Class$ReflectionData)
        ;
        // pre_init(java/lang/ref/SoftReference)
        ;
        // pre_init(java/lang/Class$Atomic)
        ;
        // pre_init(java/lang/reflect/Modifier)
        ;
        // pre_init(java/lang/reflect/ReflectAccess)
        ;
        // pre_init(sun/reflect/LangReflectAccess)
        ;
        // pre_init(java/lang/reflect/Field)
        ;
        // pre_init(sun/reflect/misc/ReflectUtil)
        ;
        // pre_init(java/util/Arrays)
        ;
        // pre_init(java/io/PrintStream)
        ;
        // pre_init(java/lang/Appendable)
        ;
        // pre_init(java/io/FilterOutputStream)
        ;
        // pre_init(java/io/BufferedOutputStream)
        ;
        // pre_init(java/io/OutputStreamWriter)
        ;
        // pre_init(java/io/Writer)
        ;
        // pre_init(sun/nio/cs/StreamEncoder)
        ;
        // pre_init(java/nio/charset/Charset)
        ;
        // pre_init(sun/nio/cs/StandardCharsets)
        ;
        // pre_init(sun/nio/cs/FastCharsetProvider)
        ;
        // pre_init(java/nio/charset/spi/CharsetProvider)
        ;
        // pre_init(sun/nio/cs/StandardCharsets$Aliases)
        ;
        // pre_init(sun/util/PreHashedMap)
        ;
        // pre_init(sun/nio/cs/StandardCharsets$Classes)
        ;
        // pre_init(sun/nio/cs/StandardCharsets$Cache)
        ;
        // pre_init(java/lang/ThreadLocal)
        ;
        // pre_init(java/util/concurrent/atomic/AtomicInteger)
        ;
        // pre_init(sun/security/action/GetPropertyAction)
        ;
        // pre_init(java/lang/StringBuilder)
        ;
        // pre_init(java/lang/AbstractStringBuilder)
        ;
        // pre_init(sun/nio/cs/UTF_8)
        ;
        // pre_init(sun/nio/cs/Unicode)
        ;
        // pre_init(sun/nio/cs/HistoricallyNamedCharset)
        ;
        // pre_init(java/lang/reflect/Constructor)
        ;
        // pre_init(java/lang/Class$1)
        ;
        // pre_init(sun/reflect/ReflectionFactory$1)
        ;
        // pre_init(sun/reflect/NativeConstructorAccessorImpl)
        ;
        // pre_init(sun/reflect/ConstructorAccessorImpl)
        ;
        // pre_init(sun/reflect/ConstructorAccessor)
        ;
        // pre_init(sun/reflect/MagicAccessorImpl)
        ;
        // pre_init(sun/reflect/DelegatingConstructorAccessorImpl)
        ;
        // pre_init(sun/nio/cs/UTF_8$Encoder)
        ;
        // pre_init(sun/nio/cs/ArrayEncoder)
        ;
        // pre_init(java/nio/charset/CharsetEncoder)
        ;
        // pre_init(java/nio/charset/CodingErrorAction)
        ;
        // pre_init(java/nio/ByteBuffer)
        ;
        // pre_init(java/nio/Buffer)
        ;
        // pre_init(java/nio/HeapByteBuffer)
        ;
        // pre_init(java/nio/Bits)
        ;
        // pre_init(java/nio/ByteOrder)
        ;
        // pre_init(java/util/concurrent/atomic/AtomicLong)
        ;
        // pre_init(java/nio/Bits$1)
        ;
        // pre_init(sun/misc/JavaNioAccess)
        ;
        // pre_init(java/io/BufferedWriter)
        ;
        // pre_init(java/lang/Runtime)
        ;
        // pre_init(java/io/File)
        ;
        // pre_init(java/io/DefaultFileSystem)
        ;
        // pre_init(java/io/UnixFileSystem)
        ;
        // pre_init(java/io/FileSystem)
        ;
        // pre_init(java/io/ExpiringCache)
        ;
        // pre_init(java/io/ExpiringCache$1)
        ;
        // pre_init(java/util/LinkedHashMap)
        ;
        // pre_init(java/lang/ClassLoader$NativeLibrary)
        ;
        // pre_init(java/lang/Terminator)
        ;
        // pre_init(java/lang/Terminator$1)
        ;
        // pre_init(sun/misc/SignalHandler)
        ;
        // pre_init(sun/misc/NativeSignalHandler)
        ;
        // pre_init(sun/misc/Signal)
        ;
        // pre_init(java/lang/Integer)
        ;
        // pre_init(java/lang/Integer$IntegerCache)
        ;
        // pre_init(java/lang/Long)
        ;
        // pre_init(java/lang/Long$LongCache)
        ;
        // pre_init(sun/misc/OSEnvironment)
        ;
        // pre_init(java/lang/System$2)
        ;
        // pre_init(sun/misc/JavaLangAccess)
        ;
        // pre_init(java/util/ArrayList)
        ;
        // pre_init(java/util/Collections$UnmodifiableRandomAccessList)
        ;
        // pre_init(java/util/Collections$UnmodifiableList)
        ;
        // pre_init(java/util/Collections$UnmodifiableCollection)
        ;
        // pre_init(sun/misc/Launcher)
        ;
        // pre_init(sun/misc/Launcher$Factory)
        ;
        // pre_init(java/net/URLStreamHandlerFactory)
        ;
        // pre_init(sun/misc/Launcher$ExtClassLoader)
        ;
        // pre_init(java/net/URLClassLoader)
        ;
        // pre_init(java/security/SecureClassLoader)
        ;
        // pre_init(sun/security/util/Debug)
        ;
        // pre_init(java/lang/ClassLoader$ParallelLoaders)
        ;
        // pre_init(java/util/WeakHashMap)
        ;
        // pre_init(java/util/Collections$SetFromMap)
        ;
        // pre_init(java/util/WeakHashMap$KeySet)
        ;
        // pre_init(java/lang/Boolean)
        ;
        // pre_init(java/util/WeakHashMap$Entry)
        ;
        // pre_init(java/lang/ref/WeakReference)
        ;
        // pre_init(java/net/URLClassLoader$7)
        ;
        // pre_init(sun/misc/JavaNetAccess)
        ;
        // pre_init(java/util/StringTokenizer)
        ;
        // pre_init(java/lang/Character)
        ;
        // pre_init(sun/misc/Launcher$ExtClassLoader$1)
        ;
        // pre_init(sun/misc/MetaIndex)
        ;
        // pre_init(java/io/File$PathStatus)
        ;
        // pre_init(java/lang/Enum)
        ;
        // pre_init(java/io/BufferedReader)
        ;
        // pre_init(java/io/Reader)
        ;
        // pre_init(java/lang/Readable)
        ;
        // pre_init(java/io/FileReader)
        ;
        // pre_init(java/io/InputStreamReader)
        ;
        // pre_init(sun/nio/cs/StreamDecoder)
        ;
        // pre_init(sun/nio/cs/UTF_8$Decoder)
        ;
        // pre_init(sun/nio/cs/ArrayDecoder)
        ;
        // pre_init(java/nio/charset/CharsetDecoder)
        ;
        // pre_init(java/io/ExpiringCache$Entry)
        ;
        // pre_init(java/util/LinkedHashMap$Entry)
        ;
        // pre_init(java/nio/CharBuffer)
        ;
        // pre_init(java/nio/HeapCharBuffer)
        ;
        // pre_init(java/nio/charset/CoderResult)
        ;
        // pre_init(java/nio/charset/CoderResult$1)
        ;
        // pre_init(java/nio/charset/CoderResult$Cache)
        ;
        // pre_init(java/nio/charset/CoderResult$2)
        ;
        // pre_init(java/lang/reflect/Array)
        ;
        // pre_init(java/io/FileInputStream$1)
        ;
        // pre_init(sun/net/www/ParseUtil)
        ;
        // pre_init(java/util/BitSet)
        ;
        // pre_init(java/io/ObjectStreamField)
        ;
        // pre_init(java/lang/Byte)
        ;
        // pre_init(java/net/URL)
        ;
        // pre_init(java/util/Locale)
        ;
        // pre_init(java/util/Locale$Cache)
        ;
        // pre_init(sun/util/locale/LocaleObjectCache)
        ;
        // pre_init(java/util/concurrent/ConcurrentHashMap)
        ;
        // pre_init(java/util/concurrent/ConcurrentMap)
        ;
        // pre_init(sun/util/locale/BaseLocale)
        ;
        // pre_init(sun/util/locale/BaseLocale$Cache)
        ;
        // pre_init(sun/util/locale/BaseLocale$Key)
        ;
        // pre_init(sun/util/locale/LocaleObjectCache$CacheEntry)
        ;
        // pre_init(java/util/concurrent/ConcurrentHashMap$Node)
        ;
        // pre_init(java/util/Locale$LocaleKey)
        ;
        // pre_init(sun/util/locale/LocaleUtils)
        ;
        // pre_init(java/lang/CharacterData)
        ;
        // pre_init(java/lang/CharacterDataLatin1)
        ;
        // pre_init(java/net/Parts)
        ;
        // pre_init(sun/net/www/protocol/file/Handler)
        ;
        // pre_init(java/net/URLStreamHandler)
        ;
        // pre_init(java/security/ProtectionDomain)
        ;
        // pre_init(java/security/ProtectionDomain$JavaSecurityAccessImpl)
        ;
        // pre_init(sun/misc/JavaSecurityAccess)
        ;
        // pre_init(java/security/ProtectionDomain$2)
        ;
        // pre_init(sun/misc/JavaSecurityProtectionDomainAccess)
        ;
        // pre_init(java/security/CodeSource)
        ;
        // pre_init(java/security/ProtectionDomain$Key)
        ;
        // pre_init(java/util/HashSet)
        ;
        // pre_init(sun/misc/URLClassPath)
        ;
        // pre_init(sun/net/www/protocol/jar/Handler)
        ;
        // pre_init(sun/misc/Launcher$AppClassLoader)
        ;
        // pre_init(sun/misc/Launcher$AppClassLoader$1)
        ;
        // pre_init(java/lang/SystemClassLoaderAction)
        ;
        // pre_init(java/lang/invoke/MethodHandleImpl)
        ;
        // pre_init(java/lang/invoke/MethodHandleImpl$1)
        ;
        // pre_init(java/lang/invoke/MethodHandleImpl$2)
        ;
        // pre_init(java/util/function/Function)
        ;
        // pre_init(java/lang/invoke/MethodHandleImpl$3)
        ;
        // pre_init(java/lang/invoke/MethodHandleImpl$4)
        ;
        // pre_init(java/lang/ClassValue)
        ;
        // pre_init(java/lang/ClassValue$Identity)
        ;
        // pre_init(java/lang/ClassValue$Version)
        ;
        // pre_init(java/lang/ClassValue$Entry)
        ;
        // pre_init(java/lang/invoke/MemberName$Factory)
        ;
        // pre_init(java/lang/invoke/MethodHandleStatics)
        ;
        // pre_init(java/lang/invoke/MethodHandleStatics$1)
        ;
        // {R0} == Object[5169] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this", Class.forName("it.polimi.dagsymb.Louvain")));
        // {R1} == Object[5170] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:config", Class.forName("it.polimi.dagsymb.LouvainConfig")));
        // pre_init(jbse/meta/Analysis)
        ;
        // pre_init(org/apache/spark/api/java/JavaSparkContext)
        ;
        // {R2} == Object[5176] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:config.inputFile", Class.forName("java.lang.String")));
        // {R4} == Object[5177] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:config.parallelism", Class.forName("java.lang.Integer")));
        // {R5} == Object[5196] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:config.minimumCompressionProgress", Class.forName("java.lang.Integer")));
        // {R6} == Object[5197] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:config.progressCounter", Class.forName("java.lang.Integer")));
        // pre_init(esem/sandbox/SymbolicProducer)
        ;
        // {R12} == Object[5201] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("[(2,esem/sandbox/SymbolicProducer)]._I", Class.forName("esem.sandbox.SymbolicProducer")));
        // {R15} == Object[5205] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong", Class.forName("[J")));
        // {V15} >= 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (V15) >= (0) ? 0 : isNaN((V15) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V15) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V15} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (V15) > (0) ? 0 : isNaN((V15) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V15) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 0 < {V15}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (0) < (V15) ? 0 : isNaN((0) - (V15)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((0) - (V15));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V15} > 1
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (V15) > (1) ? 0 : isNaN((V15) - (1)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V15) - (1));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 1 < {V15}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (1) < (V15) ? 0 : isNaN((1) - (V15)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((1) - (V15));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V19} - 2000000 > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[1]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V19 = (long) variables.get(0);
                return ((V19) - (2000000)) > (0) ? 0 : isNaN(((V19) - (2000000)) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V19) - (2000000)) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V19} - 10000000 < 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[1]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V19 = (long) variables.get(0);
                return ((V19) - (10000000)) < (0) ? 0 : isNaN(((V19) - (10000000)) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V19) - (10000000)) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V15} > 2
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (V15) > (2) ? 0 : isNaN((V15) - (2)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V15) - (2));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 2 < {V15}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (2) < (V15) ? 0 : isNaN((2) - (V15)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((2) - (V15));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V20} - 2000000 > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[2]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V20 = (long) variables.get(0);
                return ((V20) - (2000000)) > (0) ? 0 : isNaN(((V20) - (2000000)) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V20) - (2000000)) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V20} - 10000000 < 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[2]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V20 = (long) variables.get(0);
                return ((V20) - (10000000)) < (0) ? 0 : isNaN(((V20) - (10000000)) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V20) - (10000000)) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V15} > 3
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (V15) > (3) ? 0 : isNaN((V15) - (3)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V15) - (3));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 3 < {V15}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (3) < (V15) ? 0 : isNaN((3) - (V15)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((3) - (V15));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V21} - 2000000 > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[3]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V21 = (long) variables.get(0);
                return ((V21) - (2000000)) > (0) ? 0 : isNaN(((V21) - (2000000)) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V21) - (2000000)) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V21} - 10000000 < 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[3]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V21 = (long) variables.get(0);
                return ((V21) - (10000000)) < (0) ? 0 : isNaN(((V21) - (10000000)) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V21) - (10000000)) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V15} > 4
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (V15) > (4) ? 0 : isNaN((V15) - (4)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V15) - (4));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 4 < {V15}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V15 = (int) variables.get(0);
                return (4) < (V15) ? 0 : isNaN((4) - (V15)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((4) - (V15));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V22} - 2000000 > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[4]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V22 = (long) variables.get(0);
                return ((V22) - (2000000)) > (0) ? 0 : isNaN(((V22) - (2000000)) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V22) - (2000000)) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V22} - 10000000 < 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[4]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V22 = (long) variables.get(0);
                return ((V22) - (10000000)) < (0) ? 0 : isNaN(((V22) - (10000000)) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V22) - (10000000)) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {R14} == Object[5257] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("[(2,esem/sandbox/SymbolicProducer)]._I.valsDouble", Class.forName("[D")));
        // {V23} >= 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsDouble.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V23 = (int) variables.get(0);
                return (V23) >= (0) ? 0 : isNaN((V23) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V23) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V23} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsDouble.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V23 = (int) variables.get(0);
                return (V23) > (0) ? 0 : isNaN((V23) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V23) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 0 < {V23}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsDouble.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V23 = (int) variables.get(0);
                return (0) < (V23) ? 0 : isNaN((0) - (V23)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((0) - (V23));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));

        final HashMap<String, Object> candidateObjects = new HashMap<>();
        candidateObjects.put("{ROOT}:this", __ROOT_this);
        candidateObjects.put("{ROOT}:config", __ROOT_config);

        double d = distance(pathConditionHandler, candidateObjects);
        if (d == 0.0d)
            System.out.println("test0 0 distance");
        return d;
    }
}
