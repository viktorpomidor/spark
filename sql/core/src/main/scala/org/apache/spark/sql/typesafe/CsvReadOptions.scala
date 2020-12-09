package org.apache.spark.sql.typesafe

case class CsvReadOptions(sep: String, // (default ,): sets a separator for each field and value. This separator can be one or more characters.
                          encoding: String, // (default UTF-8): decodes the CSV files by the given encoding type.
                          quote: String, // (default "): sets a single character used for escaping quoted values where the separator can be part of the value. If you would like to turn off quotations, you need to set not null but an empty string. This behaviour is different from com.databricks.spark.csv.
                          escape: String, // (default \): sets a single character used for escaping quotes inside an already quoted value.
                          charToEscapeQuoteEscaping: String, // (default escape or \0): sets a single character used for escaping the escape for the quote character. The default value is escape character when escape and quote characters are different, \0 otherwise.
                          comment: String, // (default empty string): sets a single character used for skipping lines beginning with this character. By default, it is disabled.
                          header: String, // (default false): uses the first line as names of columns.
                          enforceSchema: String, // (default true): If it is set to true, the specified or inferred schema will be forcibly applied to datasource files, and headers in CSV files will be ignored. If the option is set to false, the schema will be validated against all headers in CSV files in the case when the header option is set to true. Field names in the schema and column names in CSV headers are checked by their positions taking into account spark.sql.caseSensitive. Though the default value is true, it is recommended to disable the enforceSchema option to avoid incorrect results.
                          inferSchema: String, // (default false): infers the input schema automatically from data. It requires one extra pass over the data.
                          samplingRatio: String, // (default is 1.0): defines fraction of rows used for schema inferring.
                          ignoreLeadingWhiteSpace: String, // (default false): a flag indicating whether or not leading whitespaces from values being read should be skipped.
                          ignoreTrailingWhiteSpace: String, // (default false): a flag indicating whether or not trailing whitespaces from values being read should be skipped.
                          nullValue: String, // (default empty string): sets the string representation of a null value. Since 2.0.1, this applies to all supported types including the string type.
                          emptyValue: String, // (default empty string): sets the string representation of an empty value.
                          nanValue: String, // (default NaN): sets the string representation of a non-number" value.
                          positiveInf: String, // (default Inf): sets the string representation of a positive infinity value.
                          negativeInf: String, // (default -Inf): sets the string representation of a negative infinity value.
                          dateFormat: String, // (default yyyy-MM-dd): sets the string that indicates a date format. Custom date formats follow the formats at Datetime Patterns. This applies to date type.
                          timestampFormat: String, // (default yyyy-MM-dd'T'HH:mm:ss[.SSS][XXX]): sets the string that indicates a timestamp format. Custom date formats follow the formats at Datetime Patterns. This applies to timestamp type.
                          maxColumns: String, // (default 20480): defines a hard limit of how many columns a record can have.
                          maxCharsPerColumn: String, // (default -1): defines the maximum number of characters allowed for any given value being read. By default, it is -1 meaning unlimited length
                          mode: String, // (default PERMISSIVE): allows a mode for dealing with corrupt records during parsing. It supports the following case-insensitive modes. Note that Spark tries to parse only required columns in CSV under column pruning. Therefore, corrupt records can be different based on required set of fields. This behavior can be controlled by spark.sql.csv.parser.columnPruning.enabled (enabled by default).
                          PERMISSIVE: String, // : when it meets a corrupted record, puts the malformed string into a field configured by columnNameOfCorruptRecord, and sets malformed fields to null. To keep corrupt records, an user can set a string type field named columnNameOfCorruptRecord in an user-defined schema. If a schema does not have the field, it drops corrupt records during parsing. A record with less/more tokens than schema is not a corrupted record to CSV. When it meets a record having fewer tokens than the length of the schema, sets null to extra fields. When the record has more tokens than the length of the schema, it drops extra tokens.
                          DROPMALFORMED: String, // : ignores the whole corrupted records.
                          FAILFAST: String, // : throws an exception when it meets corrupted records.
                          columnNameOfCorruptRecord: String, // (default is the value specified in spark.sql.columnNameOfCorruptRecord): allows renaming the new field having malformed string created by PERMISSIVE mode. This overrides spark.sql.columnNameOfCorruptRecord.
                          multiLine: String, // (default false): parse one record, which may span multiple lines.
                          locale: String, // (default is en-US): sets a locale as language tag in IETF BCP 47 format. For instance, this is used while parsing dates and timestamps.
                          lineSep: String, // (default covers all \r, \r\n and \n): defines the line separator that should be used for parsing. Maximum length is 1 character.
                          pathGlobFilter: String, //: an optional glob pattern to only include files with paths matching the pattern. The syntax follows org.apache.hadoop.fs.GlobFilter. It does not change the behavior of partition discovery.
                          recursiveFileLookup: String //: recursively scan a directory for files. Using this option disables partition discovery                      )
                      )