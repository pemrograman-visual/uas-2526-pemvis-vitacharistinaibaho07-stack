<?xml version="1.0"?>
<flowgorithm fileversion="4.2">
    <attributes>
        <attribute name="name" value="uas 5"/>
        <attribute name="authors" value="vitac"/>
        <attribute name="about" value=""/>
        <attribute name="saved" value="2025-12-17 04:02:49 PM"/>
        <attribute name="created" value="dml0YWM7VklUQUNIQVJJU1RJOzIwMjUtMTItMTc7MDM6MzU6NTAgUE07MjcyMg=="/>
        <attribute name="edited" value="dml0YWM7VklUQUNIQVJJU1RJOzIwMjUtMTItMTc7MDQ6MDI6NDkgUE07MTsyODMz"/>
    </attributes>
    <function name="Main" type="None" variable="">
        <parameters/>
        <body>
            <declare name="pendaftar, i" type="Integer" array="False" size=""/>
            <do expression="pendaftar&gt;=15&amp;&amp;pendaftar&lt;=1">
                <input variable="pendaftar"/>
            </do>
            <assign variable="i" expression="0"/>
            <declare name="nama" type="String" array="True" size="pendaftar"/>
            <declare name="ipk, pendapatan, tanggungan" type="Real" array="True" size="pendaftar"/>
            <for variable="i" start="0" end="pendaftar-1" direction="inc" step="1">
                <input variable="nama[i]"/>
                <input variable="ipk[i]"/>
                <input variable="pendapatan[i]"/>
                <input variable="tanggungan[i]"/>
            </for>
            <for variable="i" start="0" end="pendaftar-1" direction="inc" step="1">
                <if expression="ipk[i]&gt;=3">
                    <then>
                        <if expression="pendapatan[i]&lt;=3000000">
                            <then>
                                <if expression="tanggungan[i]&lt;3">
                                    <then>
                                        <output expression="nama[n] &amp;&amp; &quot;lolos&quot;" newline="True"/>
                                    </then>
                                    <else>
                                        <output expression="nama[i]&amp;&amp;&quot;Tidak lolos&quot;" newline="True"/>
                                    </else>
                                </if>
                            </then>
                            <else>
                                <output expression="nama[i]&amp;&amp;&quot;Tidak lolos&quot;" newline="True"/>
                            </else>
                        </if>
                    </then>
                    <else>
                        <output expression="nama[i]&amp;&amp;&quot;Tidak lolos&quot;" newline="True"/>
                    </else>
                </if>
            </for>
        </body>
    </function>
</flowgorithm>
