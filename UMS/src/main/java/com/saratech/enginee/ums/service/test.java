<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
   
    <parent>
        <groupId>com.saratech.enginee</groupId>
        <artifactId>Inventory</artifactId>
        <version>1.0</version>
    </parent>
    <artifactId>web</artifactId>
    <packaging>war</packaging>
    <name>web</name>

    <properties>
        <springframework.version>4.0.6.RELEASE</springframework.version>
        <mysql.connector.version>5.1.31</mysql.connector.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>com.saratech.enginee</groupId>
            <artifactId>Util</artifactId>
            <version>${project.version}</version>
        </dependency>
        <dependency>
            <groupId>com.saratech.enginee</groupId>
            <artifactId>UMS</artifactId>
            <version>${project.version}</version>
        </dependency>
        <dependency>
            <groupId>com.saratech.enginee</groupId>
            <artifactId>Auth</artifactId>
            <version>${project.version}</version>
        </dependency>
        <!-- Spring -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>${springframework.version}</version>
        </dependency>
		
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-tx</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-orm</artifactId>
            <version>${springframework.version}</version>
        </dependency>

        <!-- MySQL -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>${mysql.connector.version}</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/log4j/log4j -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
            <type>jar</type>
        </dependency>
        
    </dependencies>
    <build>
        <finalName>api</finalName>
        <pluginManagement>
            <plugins>
			<plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <executions>
          <execution>
            <id>make-a-jar</id>
            <phase>compile</phase>
            <goals>
              <goal>jar</goal>
            </goals>
            <configuration>
              <finalName>web-1.0</finalName>
            </configuration>
          </execution>
        </executions>
      </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.2</version>
                    <configuration>
                        <source>1.7</source>
                        <target>1.7</target>
                    </configuration>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>


</project>
