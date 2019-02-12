package it.polimi.dagsymb;
import static sushi.compile.path_condition_distance.DistanceBySimilarityWithPathCondition.distance;

import static java.lang.Double.*;
import static java.lang.Math.*;

import sushi.compile.path_condition_distance.*;
import sushi.logging.Level;
import sushi.logging.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvoSuiteWrapper_0_4 {
    private static final double SMALL_DISTANCE = 1;
    private static final double BIG_DISTANCE = 1E300;

    private static final String STRING_LITERAL_0 = "";
    private static final String STRING_LITERAL_1 = "it.polimi.dagsymb.Louvain";
    private static final String STRING_LITERAL_2 = "local";
    private static final String STRING_LITERAL_3 = "valsDouble";
    private static final String STRING_LITERAL_4 = "valsLong";

    public double test0(it.polimi.dagsymb.Louvain __ROOT_this, it.polimi.dagsymb.LouvainConfig __ROOT_config) throws Exception {
        //generated for state .1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.2.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1[323]
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
        // pre_init(org/apache/spark/graphx/TripletFields)
        ;
        // {R9} == null
        pathConditionHandler.add(new SimilarityWithRefToNull("[(2,org/apache/spark/graphx/TripletFields)].All"));
        // pre_init(esem/sandbox/SymbolicProducer)
        ;
        // {R10} == Object[5199] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("[(2,esem/sandbox/SymbolicProducer)]._I", Class.forName("esem.sandbox.SymbolicProducer")));
        // {R13} == Object[5203] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong", Class.forName("[J")));
        // {V12} >= 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) >= (0) ? 0 : isNaN((V12) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (0) ? 0 : isNaN((V12) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 0 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (0) < (V12) ? 0 : isNaN((0) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((0) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 1
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (1) ? 0 : isNaN((V12) - (1)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (1));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 1 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (1) < (V12) ? 0 : isNaN((1) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((1) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V16} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[1]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V16 = (long) variables.get(0);
                return (V16) >= (0) ? 0 : isNaN((V16) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V16) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 2
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (2) ? 0 : isNaN((V12) - (2)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (2));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 2 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (2) < (V12) ? 0 : isNaN((2) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((2) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V17} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[2]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V17 = (long) variables.get(0);
                return (V17) >= (0) ? 0 : isNaN((V17) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V17) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 3
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (3) ? 0 : isNaN((V12) - (3)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (3));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 3 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (3) < (V12) ? 0 : isNaN((3) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((3) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V18} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[3]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V18 = (long) variables.get(0);
                return (V18) >= (0) ? 0 : isNaN((V18) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V18) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 4
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (4) ? 0 : isNaN((V12) - (4)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (4));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 4 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (4) < (V12) ? 0 : isNaN((4) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((4) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V19} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[4]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V19 = (long) variables.get(0);
                return (V19) >= (0) ? 0 : isNaN((V19) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V19) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 0 <= {V3}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:config.progressCounter");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V3 = (int) variables.get(0);
                return (0) <= (V3) ? 0 : isNaN((0) - (V3)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((0) - (V3));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 5
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (5) ? 0 : isNaN((V12) - (5)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (5));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 5 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (5) < (V12) ? 0 : isNaN((5) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((5) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V20} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[5]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V20 = (long) variables.get(0);
                return (V20) >= (0) ? 0 : isNaN((V20) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V20) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 6
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (6) ? 0 : isNaN((V12) - (6)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (6));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 6 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (6) < (V12) ? 0 : isNaN((6) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((6) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V21} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[6]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V21 = (long) variables.get(0);
                return (V21) >= (0) ? 0 : isNaN((V21) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V21) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 7
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (7) ? 0 : isNaN((V12) - (7)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (7));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 7 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (7) < (V12) ? 0 : isNaN((7) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((7) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V22} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[7]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V22 = (long) variables.get(0);
                return (V22) >= (0) ? 0 : isNaN((V22) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V22) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V19} + {V22} -  ~ WIDEN-J({V2}) < 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[4]");
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[7]");
                retVal.add("{ROOT}:config.minimumCompressionProgress");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V19 = (long) variables.get(0);
                final long V22 = (long) variables.get(1);
                final int V2 = (int) variables.get(2);
                return (((V19) + (V22)) - (-(V2))) < (0) ? 0 : isNaN((((V19) + (V22)) - (-(V2))) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((((V19) + (V22)) - (-(V2))) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 8
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (8) ? 0 : isNaN((V12) - (8)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (8));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 8 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (8) < (V12) ? 0 : isNaN((8) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((8) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V23} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[8]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V23 = (long) variables.get(0);
                return (V23) >= (0) ? 0 : isNaN((V23) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V23) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 9
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (9) ? 0 : isNaN((V12) - (9)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (9));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 9 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (9) < (V12) ? 0 : isNaN((9) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((9) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V24} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[9]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V24 = (long) variables.get(0);
                return (V24) >= (0) ? 0 : isNaN((V24) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V24) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 10
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (10) ? 0 : isNaN((V12) - (10)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (10));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 10 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (10) < (V12) ? 0 : isNaN((10) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((10) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V25} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[10]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V25 = (long) variables.get(0);
                return (V25) >= (0) ? 0 : isNaN((V25) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V25) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 11
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (11) ? 0 : isNaN((V12) - (11)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (11));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 11 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (11) < (V12) ? 0 : isNaN((11) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((11) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V26} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[11]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V26 = (long) variables.get(0);
                return (V26) >= (0) ? 0 : isNaN((V26) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V26) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 12
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (12) ? 0 : isNaN((V12) - (12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 12 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (12) < (V12) ? 0 : isNaN((12) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((12) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V27} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[12]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V27 = (long) variables.get(0);
                return (V27) >= (0) ? 0 : isNaN((V27) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V27) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 13
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (13) ? 0 : isNaN((V12) - (13)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (13));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 13 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (13) < (V12) ? 0 : isNaN((13) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((13) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V28} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[13]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V28 = (long) variables.get(0);
                return (V28) >= (0) ? 0 : isNaN((V28) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V28) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V25} + {V28} - {V19} + {V22} - WIDEN-J({V2}) >= 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[10]");
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[13]");
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[4]");
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[7]");
                retVal.add("{ROOT}:config.minimumCompressionProgress");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V25 = (long) variables.get(0);
                final long V28 = (long) variables.get(1);
                final long V19 = (long) variables.get(2);
                final long V22 = (long) variables.get(3);
                final int V2 = (int) variables.get(4);
                return (((V25) + (V28)) - (((V19) + (V22)) - (V2))) >= (0) ? 0 : isNaN((((V25) + (V28)) - (((V19) + (V22)) - (V2))) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((((V25) + (V28)) - (((V19) + (V22)) - (V2))) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 1 <= {V3}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:config.progressCounter");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V3 = (int) variables.get(0);
                return (1) <= (V3) ? 0 : isNaN((1) - (V3)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((1) - (V3));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 14
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (14) ? 0 : isNaN((V12) - (14)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (14));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 14 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (14) < (V12) ? 0 : isNaN((14) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((14) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V29} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[14]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V29 = (long) variables.get(0);
                return (V29) >= (0) ? 0 : isNaN((V29) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V29) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 15
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (15) ? 0 : isNaN((V12) - (15)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (15));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 15 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (15) < (V12) ? 0 : isNaN((15) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((15) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V30} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[15]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V30 = (long) variables.get(0);
                return (V30) >= (0) ? 0 : isNaN((V30) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V30) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V12} > 16
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (V12) > (16) ? 0 : isNaN((V12) - (16)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V12) - (16));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 16 < {V12}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V12 = (int) variables.get(0);
                return (16) < (V12) ? 0 : isNaN((16) - (V12)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((16) - (V12));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V31} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsLong[16]");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final long V31 = (long) variables.get(0);
                return (V31) >= (0) ? 0 : isNaN((V31) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V31) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {R12} == Object[5374] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("[(2,esem/sandbox/SymbolicProducer)]._I.valsDouble", Class.forName("[D")));
        // {V32} >= 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsDouble.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V32 = (int) variables.get(0);
                return (V32) >= (0) ? 0 : isNaN((V32) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V32) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V32} > 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsDouble.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V32 = (int) variables.get(0);
                return (V32) > (0) ? 0 : isNaN((V32) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V32) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // 0 < {V32}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("[(2,esem/sandbox/SymbolicProducer)]._I.valsDouble.length");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V32 = (int) variables.get(0);
                return (0) < (V32) ? 0 : isNaN((0) - (V32)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((0) - (V32));
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
